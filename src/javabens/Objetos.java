package javabens;

public class Objetos {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Victor");
        System.out.println("Aluno: " + aluno.getNome());


        aluno.setIdade(22);
        System.out.println("Aluno idade: " + aluno.getIdade());

    }
}
