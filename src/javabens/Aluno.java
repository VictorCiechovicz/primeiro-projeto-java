package javabens;

public class Aluno {
    private String nome;
    private int idade;

    public void setIdade(int newIdade) {

        if (newIdade < 0) {
            throw new IllegalArgumentException("Idade menor ou igual a zero");
        }
        idade = newIdade;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String newNome) {
        nome = newNome;
    }

    public String getNome() {
        return nome;
    }
}
