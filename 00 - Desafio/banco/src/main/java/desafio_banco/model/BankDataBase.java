package desafio_banco.model;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Singleton para armazenar informações sobre contas bancárias.
 * Utiliza um Map para armazenar as contas com o número da conta como chave.
 */

@Component
public class BankDataBase {
    private Map<String, BankAccount> accounts = new HashMap<>();

    public void addAccount(BankAccount account){
        accounts.put(account.getAccountNumber(), account);
    }

    public BankAccount getAccount(String accountNumber){
        return accounts.get(accountNumber);
    }


}
