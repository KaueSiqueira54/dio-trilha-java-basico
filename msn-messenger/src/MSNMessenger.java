//encapsualamento, nem tudo precisa ser visivel
//usuário não precisa ver se está conectado a internet
//essa verificação acontece de forma automática na classe privada
//capsuclar = esconder
//quebrar algoritmos em pedaços menores privados

public class MSNMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem..");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem..");
    }
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico de mensagens");
    }
}
