package pilares_poo.heranca;

public class ComputadorJoao {
    public static void main(String[] args) {

        FacebookMensager facebook = new FacebookMensager();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
        
        MSNMensager msnm = new MSNMensager();
        msnm.enviarMensagem();
        msnm.receberMensagem();

    }
}
