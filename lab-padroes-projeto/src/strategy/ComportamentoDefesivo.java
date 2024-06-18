package strategy;

public class ComportamentoDefesivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se Defensivamente...");
    }
}
