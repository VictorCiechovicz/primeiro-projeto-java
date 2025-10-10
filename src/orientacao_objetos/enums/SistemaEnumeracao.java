package orientacao_objetos.enums;

public class SistemaEnumeracao {
    public static void main(String[] args) {
        EstadosBrasileiros est = EstadosBrasileiros.MARANHAO;

        System.out.println(est.getNome());
        System.out.println(est.getSigla());


        //outra forma de capturar os valores do enum
        EstadosBrasileiros est2 = EstadosBrasileiros.valueOf("SAO_PAULO");
        System.out.println(est2.getNome());
        System.out.println(est2.getSigla());

        //Pegar todos os valores do enum
        for (EstadosBrasileiros e : EstadosBrasileiros.values()) {
            
            System.out.println(e.getNome());
            System.out.println(e.getSigla());
        }

    }
}
