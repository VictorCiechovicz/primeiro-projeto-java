package pilares_poo.encapsulamento;

public class MSNMessenger {

    private boolean validarConectadoInternet() {
        return true;
    }

    public void enviarMensagem() {
        if (validarConectadoInternet()) {
            System.out.println("Enviando mensagem");
        } else {
            System.err.println("Computador Off-line");
        }

    }

    public void receberMensagem() {
        if (validarConectadoInternet()) {
            System.out.println("Recebendo mensagem");
        } else {
            System.err.println("Computador Off-line");
        }

    }


    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
