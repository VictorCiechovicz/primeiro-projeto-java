package orientacao_objetos.equals;

public class Comparacao {

    public static void main(String[] args) {
        Integer n1 = 128;
        Integer n2 = 128;

        Integer n3 = 128;
        Integer n4 = 128;

        //com == é possivel comparar variaveis primitivas(como int, char, boolean)
        System.out.println(n3 == n4);

        //com equals eu consigo comparar o conteudo dos objetos (como String, Integer)
        System.out.println(n1.equals(n2));
    }
}
