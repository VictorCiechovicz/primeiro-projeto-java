package expressoes;

import java_time.LocalDateSample;

import javax.xml.crypto.Data;
import java.time.LocalDate;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome = "Victor avila ciechovicz";
        Integer matricula = 10;
        Double salario = 1050.23;
        LocalDate admissao = LocalDate.now();

        String impresso = String.format("Mat.: %05d Nome.: %-30.30s Sal.: %,.2f Admissao.: %td/%<tm/%<ty", matricula, nome, salario, admissao);
        System.out.println(impresso);

        System.out.printf("O valor é: %.2f", 5.6789);

        //Espesificadores s = string, d = numero inteiro, f = numero com ponto flutuante, t = para datas tempo
        //%05d coloca 5 zeros antes do numero
        //%-30.30s delimita maximo e minímo de 30 caracters para esse campo
        // %,.2f deixa o numero com ponto e dois zeros depois da virgula
    }
}
