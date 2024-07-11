package desafio_banco.presenter;

import desafio_banco.model.BankAccount;
import desafio_banco.model.BankDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankFacade {
    @Autowired
    private BankDataBase bankDataBase;

    private AuthenticationStrategy authStrategy;

    /**
     * Define a estratétgia de autenticação a ser utilizada.
     */
    public void setAuthStrategy(AuthenticationStrategy authStrategy){
        this.authStrategy = authStrategy;
    }

    /**
     * Autentica o usuario com base na estrategia definida
     */

    public boolean authenticate(String accountNumber, String credentials){
        return authStrategy.authenticate(accountNumber, credentials);
    }

    /**
     * Realiza um depósito na conta especificada.
     */
    public void deposit(String accountNumber, double amount){
        BankAccount account = bankDataBase.getAccount(accountNumber);
        if(account != null){
            account.setBalance(account.getBalance() + amount);
        }
    }

    /**
     * Realiza um saque na conta especificada.
     */
    public void withdraw(String accountNumber, double amount){
        BankAccount account = bankDataBase.getAccount(accountNumber);
        if(account != null && account.getBalance() >= amount){
            account.setBalance(account.getBalance() - amount);
        }
    }

    /**
     * Transfere um valor de uma conta para outra.
     */
    public void transfer(String fromAccountNumber, String toAccountNumber, double amount){
        BankAccount fromAccount = bankDataBase.getAccount(fromAccountNumber);
        BankAccount toAccount = bankDataBase.getAccount(toAccountNumber);
        if (fromAccount != null && toAccount != null && fromAccount.getBalance() >= amount) {
            fromAccount.setBalance(fromAccount.getBalance() - amount);
            toAccount.setBalance(toAccount.getBalance() + amount);
        }
    }

    /**
     * Retorna o saldo da conta especificada.
     */

    public double getBalance(String accountNumber){
        BankAccount account = bankDataBase.getAccount(accountNumber);
        return account != null ? account.getBalance() : 0;
    }

}
