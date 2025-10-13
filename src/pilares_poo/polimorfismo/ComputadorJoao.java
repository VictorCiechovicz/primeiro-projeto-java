package pilares_poo.polimorfismo;

public class ComputadorJoao {
    public static void main(String[] args) {

        SistemaMensagemInstantanea smi = null;
        String appEscolhido = "TELEGRAM";

        if (appEscolhido.equals("FACEBOOK")) {
            smi = new FacebookMensager();
        } else if (appEscolhido.equals("TELEGRAM")) {
            smi = new Telegram();
        } else {
            smi = new MSNMensager();
        }
        
        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
