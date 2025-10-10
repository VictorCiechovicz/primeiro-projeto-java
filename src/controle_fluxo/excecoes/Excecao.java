package controle_fluxo.excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            String nome;

            do {
                System.out.println("Digite seu nome");
                nome = scanner.next();

                if (!nome.matches("[a-zA-Z ]+")) {
                    System.out.println("Entrada inválida. Por favor, digite apenas letras.");
                }


            } while (!nome.matches("[a-zA-Z ]+"));

            String sobrenome;
            do {
                System.out.println("Digite seu sobrenome");
                sobrenome = scanner.next();

                if (!sobrenome.matches("[a-zA-Z ]+")) {
                    System.out.println("Entrada inválida. Por favor, digite apenas letras.");
                }


            } while (!sobrenome.matches("[a-zA-Z ]+"));


            int idade = 0;
            boolean entradaValida = false;

            do {
                System.out.println("Digite sua idade");
                try {
                    // Tenta ler um número inteiro do console
                    idade = scanner.nextInt();

                    // Verifica se a idade é positiva
                    if (idade > 0) {
                        entradaValida = true; // Define a flag como verdadeira para sair do loop
                    } else {
                        System.out.println("A idade deve ser um número positivo.");
                    }

                } catch (InputMismatchException e) {
                    // Captura a exceção se a entrada não for um número
                    System.out.println("Entrada inválida. Digite apenas números.");
                    scanner.next(); // Limpa o buffer do scanner para evitar loop infinito
                }
            } while (!entradaValida);


            double altura = 0.00;
            boolean alturaValida = false;


            do {
                System.out.println("Digite sua altura");
                try {

                    altura = scanner.nextDouble();

                    if (altura > 0 && altura <= 3.00) {
                        alturaValida = true;
                    } else {
                        System.out.println("A altura deve ser um número positivo.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Digite apenas números.");
                    scanner.next(); // Limpa o buffer do scanner para evitar loop infinito
                }
            } while (!alturaValida);

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        } catch (Exception e) {
            System.out.println("Nao foi possível realizar o cadastro!");
        } finally {

        }

    }
}

