package desafio_banco.view;

import desafio_banco.model.BankAccount;
import desafio_banco.model.BankDataBase;
import desafio_banco.presenter.BankFacade;
import desafio_banco.presenter.PasswordAuthentication;
import desafio_banco.presenter.TokenAuthentication;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para fornecer endpoints para operações bancárias.
 */
@RestController
@RequestMapping("/bank")
public class BankController {
    @Autowired
    private BankFacade bankFacade;

    @Autowired
    private BankDataBase bankDataBase;

    /**
     * Método inicial para configurar algumas contas de teste.
     */
    @PostConstruct
    public void init(){
        // Inicializando algumas contas para teste
        bankDataBase.addAccount(new BankAccount("123456", "senha123", "tokenABC", 1000.0));
        bankDataBase.addAccount(new BankAccount("654321", "senha321", "tokenXYZ", 500.0));
    }

    /**
     * Endpoint para autenticar um usuário
     *
     * @param accountNumber Número da conta.
     * @param credentials Credenciais (senha ou token).
     * @param method Método de autenticação (password ou token).
     * @return  Mensagem de sucesso ou falha na autenticação.     *
     */

    @PostMapping("/authenticate")
    public String authenticate(@RequestParam String accountNumber, @RequestParam String credentials, @RequestParam String method) {
        if ("password".equalsIgnoreCase(method)) {
            bankFacade.setAuthStrategy(new PasswordAuthentication());
        } else if ("token".equalsIgnoreCase(method)) {
            bankFacade.setAuthStrategy(new TokenAuthentication());
        }

        if(bankFacade.authenticate(accountNumber, credentials)){
            return "Autenticação bem-sucedida";
        }else {
            return "Falha na autenticação";
        }
    }

    /**
     * Endpoint para realizar um depósito.
     *
     * @param accountNumber Número da conta.
     * @param amount Valor a ser depositado.
     * @return mensagem de sucesso.
     */
    @PostMapping("/deposit")
    public String deposit(@RequestParam String accountNumber, @RequestParam double amount) {
        bankFacade.deposit(accountNumber, amount);
        return "Depósito realizado com sucesso!";
    }

    /**
     * Endpoint para realizar um saque.
     *
     * @param accountNumber Número da conta.
     * @param amount Valor a ser sacado.
     * @return Mensagem de sucesso.
     */
    @PostMapping("/withdraw")
    public String withdraw(@RequestParam String accountNumber, @RequestParam double amount) {
        bankFacade.withdraw(accountNumber, amount);
        return "Saque realizado com sucesso!";
    }

    /**
     * Endpoint para realizar uma transferência.
     *
     * @param fromAccountNumber Número da conta de origem.
     * @param toAccountNumber Número da conta de destino.
     * @param amount Valor a ser transferido.
     * @return mensagem de sucesso
     */
    @PostMapping("/transfer")
    public String transfer(@RequestParam String fromAccountNumber, @RequestParam String toAccountNumber, @RequestParam double amount){
        bankFacade.transfer(fromAccountNumber, toAccountNumber, amount);
        return "Transferência realizada com sucesso!";
    }

    /**
     * Endpoint para consultar o saldo
     *
     * @param accountNumber Número da conta.
     * @return Saldo da conta
     */
    @GetMapping("/balance")
    public double getBalance(@RequestParam String accountNumber){
        return bankFacade.getBalance(accountNumber);
    }
}
