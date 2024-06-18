package singleton;

//Singleton "Lazy Holder"

public class SingletonLazerHolder {

    private static class InstanciaHolder {
        public static SingletonLazerHolder instancia = new SingletonLazerHolder();
    }

    private SingletonLazerHolder() {
        super();
    }

    public static SingletonLazerHolder getInstancia() {
        return InstanciaHolder.instancia;
    }
}
