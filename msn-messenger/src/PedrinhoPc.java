import apps.Facebook;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class PedrinhoPc {
    //exemplo polimorfismo
    public static void main(String[] args) {


        ServicoMensagemInstantanea smi = null;
        //Não se sabe qual app Pedrinho vai utilizar
        //Porém, qualquer um deverá enviar e receber mensagem
        //qualquer servico vai executar, mudo somente o objeto
        String appEscolhido = "msn";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fcb"))
            smi = new Facebook();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
