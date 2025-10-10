package orientacao_objetos.instancia_construtores;

import java.awt.*;

public class Student {

    String name;
    int age;
    Color color;
    String sex;

    //Métodos
    public void eating(String lunch) {
        System.out.println("Aluno: " + name);
        System.out.println("Comeu: " + lunch);
    }

    public void drinking(String drink) {
        System.out.println("Aluno: " + name);
        System.out.println("Bebeu: " + drink);
    }

    public void running(Double quilometers) {
        System.out.println("Aluno: " + name);
        System.out.println("Correu: " + quilometers + "km");
    }

    //Construtor
    public Student(String newNome, Integer newAge) {
        name = newNome;
        age = newAge;
    }

}
