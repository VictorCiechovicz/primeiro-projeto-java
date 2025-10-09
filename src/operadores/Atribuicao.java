package operadores;

public class Atribuicao {
    public static void main(String[] args) {
        String nome = "Victor ";
        nome = nome.concat("Ciechovicz");
        System.out.println(nome);

        int n1 = 1;
        int n2 = 2;

        //mesma coisa que n2= n1+n2
        n2 += n1;

        System.out.println(n2);

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        
//qual o resultado das expressões abaixo?
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        concatenacao = 1 + "1" + 1 + 1;
        concatenacao = 1 + "1" + 1 + "1";
        concatenacao = "1" + 1 + 1 + 1;
        concatenacao = "1" + (1 + 1 + 1);


    }

}
