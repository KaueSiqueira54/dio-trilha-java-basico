package apps;
public abstract class ServicoMensagemInstantanea {
    //abstração
    //todas as classes filhas deverão implementar seu modo de enviar e receber mensagem
    public abstract  void enviarMensagem();
    public abstract void receberMensagem();

    //polimorfismo protected
    public abstract void salvarHistoricoMensagem();

    //protect deixa visivel somente para classes filhas
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
}
