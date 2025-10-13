package classes_essenciais;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ClassesEssenciais {
    public static void main(String[] args) {

        //Imprimir informacaoes do console Classe System
        System.out.println("Classe Essenciais");
        System.err.println("Error Classe Essenciais");

        //Obter informacoes de inputs Classe Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        System.out.println("Digite sua idade: ");
        Integer idade = scan.nextInt(); //converte o valor inserido para um Intege
        System.out.println("Digite sua idade: ");
        Double peso = scan.nextDouble(); //converte o valor inserido para um Double
        System.out.println("Seu nome é : " + nome);
        System.out.println("Sua idade é : " + idade);
        System.out.println("Sua peso é : " + peso);


        //Outra forma de utilizar o scanner convertendo uma string em um objeto
        String name = null;
        Integer age = null;
        Double weight = null;

        //simulando uma linha existente em um arquivo txt
        String stringLinhaArquivo = "gleyson sampaio;32;1.59";
        Scanner scanNew = new Scanner(stringLinhaArquivo);
        scanNew.useDelimiter(";"); //definindo um delimitador

        //conhecendo novos recursos
        int index = 0;
        while (scanNew.hasNext()) { //olha um conceito de controle de repetição send

            if (index == 0) // Uuufa, sorte que eu aprendi sobre controle de flux
                nome = scanNew.next();
            else if (index == 1)
                idade = Integer.valueOf(scanNew.next());
            else
                peso = Double.valueOf(scanNew.next());

            index++; //mais um conceito escondido bem aqui !!
        }

        System.out.println("Seu nome é : " + nome);
        System.out.println("Sua idade é : " + idade);
        System.out.println("Sua peso é : " + peso);


        //Forma de utilizar a classe PrintStream para impressao de uma forma mais dinamica
        String nomeNome = "gleyson";
        int idadeIdade = 32;
        double pesoPeso = 1.58;
        double renda = 3234.56;

        System.out.printf("Nome: %s Idade: %d Peso: %.2f Renda: R$ %,.2f", nomeNome, idadeIdade, pesoPeso, renda);
        //Resultado no console: Nome: gleyson Idade: 32 Peso: 1,58 Renda: R$ 3234.56


        //Classes manipuladoras de Strings
        StringBuilder stringAlteravel = new StringBuilder("gleyson ");

        // acrescentando o conteúdo sampaio
        stringAlteravel.append("sampaio");

        // substituindo o nome gleyson (os 7 digitos) para izabelly
        stringAlteravel.replace(0, 7, "izabelly");

        //removendo o nome sampaio com um spaço no início
        stringAlteravel.delete(8, 16);
     /*
     inserindo o conteúdo sampaio novamente
     a diferença entre insert e append é que o insert possibilita informa
     inclusive no início do conteúdo
     */
        stringAlteravel.insert(8, " sampaio");
        stringAlteravel.insert(0, "Miss ");

        System.out.println(stringAlteravel.toString());


        //Classes manipuladoras de numeros

        Integer.valueOf("123"); //Converte um número em forma de texto (string) para número
        Integer.toString(123); // Converte um número para texto (string)


        BigDecimal precoLitro = BigDecimal.valueOf(5.799);
        BigDecimal listrosUtilizados = BigDecimal.valueOf(21.752);
        BigDecimal valorPagar = listrosUtilizados.multiply(precoLitro);
        System.out.println(valorPagar); //126.139848

        //arredondando ...
        BigDecimal valorPagarArredondado = valorPagar.setScale(2, RoundingMode.HALF_UP);
        System.out.println(valorPagarArredondado); //126.14

    }
}
