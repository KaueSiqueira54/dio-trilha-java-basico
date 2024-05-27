import apps.Facebook;
import apps.MSNMessenger;
import apps.Telegram;

public class ComputadorPedrinho {
   public static void main(String[] args) {
    MSNMessenger msn = new MSNMessenger();
    System.out.println("MSN");
    msn.enviarMensagem();
    msn.receberMensagem();

    //criando objeto fcb
    Facebook fcb = new Facebook();
    System.out.println("Facebook");
    fcb.enviarMensagem();
    fcb.receberMensagem();

    //criando objeto tlg
    Telegram tlg = new Telegram();
    System.out.println("Telegram");
    tlg.enviarMensagem();
    tlg.receberMensagem();
    //todosas classes filhas herdaram enviar e receber mensagem da clase pai
   }
}
 
