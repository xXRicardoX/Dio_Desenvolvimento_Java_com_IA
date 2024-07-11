package desafio_banco.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BankAccount {
    @Id
    private String accountNumber;
    private String password;
    private String token;
    private double balance;

    // Construtores, getters e setters
    public BankAccount(){
        super();
    }

    public BankAccount(String accountNumber, String password, String token, double balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.token = token;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
