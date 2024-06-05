public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
        

    @Override
    public void imprimirExtrato() {
        System.out.println("***EXTRAT0-CONTA-POUPANÇA***");
        super.ImprimirInfo();
    }

}
