package dio;

//Testes relacionados ao Design Pattern Singleton

public class Teste {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazerHolder holder = SingletonLazerHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazerHolder.getInstancia();
        System.out.println(holder);
    }
}

