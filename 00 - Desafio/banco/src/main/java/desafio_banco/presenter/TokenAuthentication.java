package desafio_banco.presenter;

import desafio_banco.model.BankAccount;
import desafio_banco.model.BankDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Implementação de autenticação por token.
 */

@Component
public class TokenAuthentication implements AuthenticationStrategy{
    @Autowired
    private BankDataBase bankDataBase;

    @Override
    public boolean authenticate(String accountNumber, String token) {
        BankAccount account = bankDataBase.getAccount(accountNumber);
        return account != null && account.getToken().equals(token);
    }
}
