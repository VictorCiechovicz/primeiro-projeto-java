package controle_fluxo.condicional;

import java.util.Random;

public class CaixarEletronico {
    public static void main(String[] args) {
        double saldo = 20.0;
        double valorSolicitado = 22.0;

        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }

//switc case
        String sigla = "M";

        switch (sigla) {
            case "M": {
                System.out.println("sigla M");
                break;
            }
            default: {
                System.out.println("Sigla invalido!");
            }

        }


        int numLooping = 4;
        String[] alunos = {"ANA", "JULIA", "PEDRO"};
        //For
        for (int i = 0; i < numLooping; i++) {
            System.out.println(i);
        }

        //For each
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        //While
        while (numLooping > 0) {
            numLooping--;
            System.out.println("passei");
        }


        boolean acordado = true;
        int carneirinhos = 0;

        while (acordado) {
            System.out.println("Contando carneirinhos...");
            acordado = !(new Random().nextInt(10) == carneirinhos);
        }
        System.out.println("Dormiu....");

// Do While

        do {
            System.out.println("plim plim plim....");
        } while (tocando());

        System.out.println("Alô !!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu?");
        return atendeu;
    }

    ;
}
