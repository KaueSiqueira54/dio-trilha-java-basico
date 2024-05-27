public class Carro extends Veiculo {

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    //encapsulando métodos, deixando apenas um público, restante encapsulado (privado), nem tudo precisa estar visivel para o usuário

    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio() {
        System.out.println("Conferindo cambio em P");
    }

}
