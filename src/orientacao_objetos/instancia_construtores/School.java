package orientacao_objetos.instancia_construtores;

public class School {

    public static void main(String[] args) {

        //Quando tenho contrutores dentro da minha classe Student os parametros que coloco nele sao obriagatorios passar
        //para instaciar um novo objeto
        Student stude1 = new Student("Victor", 12);


        stude1.eating("Macarrao");
        stude1.drinking("Agua");
        stude1.running(2.2);

    }
}
