package one.digitalinnovation.gof;

/**
 * Singleton "Lazy Holder".
 *
 * @author xXRicardoX
 * @see <a href="https://stackoverflow/a/24018148">Referencia</a>
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
