package one.digitalinnovation.gof;

/**
 * Singleton "preguiçoso"
 *
 * @author xXRicardoX
 */


public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }


    public static SingletonLazy getInstancia() {
        if (instancia == null) instancia = new SingletonLazy();
        return instancia;
    }
}
