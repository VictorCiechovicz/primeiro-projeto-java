package excecoes;

public class Excecoes {

    public static void main(String[] args) {
        try {
            Double valor = (double) (100 / 0);
            System.out.println(valor);
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        } finally {
            System.out.println("Final do bloco!");
        }
    }
}
