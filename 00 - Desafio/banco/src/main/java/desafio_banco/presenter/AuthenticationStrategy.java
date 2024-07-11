package desafio_banco.presenter;

/**
 * Interface para diferentes estratégias de autenticação.
 */
public interface AuthenticationStrategy {
    boolean authenticate(String accountNumber, String credentials);
}
