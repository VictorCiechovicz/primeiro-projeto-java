package arrays_colecoes;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Colecao {
    public static void main(String[] args) {
        //LinkedList é tanto um: List, Queue e Deque
        Queue candidatos = new LinkedList();

        candidatos.add("Gleyson");
        candidatos.add("Julia");
        candidatos.add("Izabelly");
        candidatos.add("Carlos");

        imprimirCandidatos(candidatos);

        // recupera MAS não remove da Fila
        Object proximo = candidatos.peek();
        System.out.println("O proximo candidato é: " + proximo);

        // recupera E remove da Fila
        proximo = candidatos.poll();
        System.out.println("O candidato " + proximo + " entrou na sala de entrevistas");

        imprimirCandidatos(candidatos);
    }

    // não se assuste com o nível de abstração, em breve você vai entender
    static void imprimirCandidatos(Collection candidatos) {
        System.out.println("***Listando os candidatos***");
        for (Object candidato : candidatos) {
            System.out.println(candidato);
        }
    }
}