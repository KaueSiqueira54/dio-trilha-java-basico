package apps;
//encapsualamento, nem tudo precisa ser visivel
//usuário não precisa ver se está conectado a internet
//essa verificação acontece de forma automática na classe privada
//capsular = esconder
//quebrar algoritmos em pedaços menores privados

public class MSNMessenger extends ServicoMensagemInstantanea {
    //obrigatoriamente cada um deve ter sua lógica de enviar, pela abstração
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");        
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagem pelo MSN");        
    }
    
}
