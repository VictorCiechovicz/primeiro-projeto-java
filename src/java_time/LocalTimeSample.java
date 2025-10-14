package java_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class LocalTimeSample {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();

        LocalTime horaMinutoSegundoEspecifico = LocalTime.of(13, 21, 42); // 13:21:42

        LocalTime horaMinutoEspecifico = LocalTime.of(13, 21); // 13:21

        LocalTime horaDeUmaString = LocalTime.parse("13:21:42");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        LocalTime horaDeUmaStringDespadronizada = LocalTime.parse("132142", formatter); // 13:21:42

        System.out.println(horaAtual);
        System.out.println(horaMinutoSegundoEspecifico);
        System.out.println(horaMinutoEspecifico);
        System.out.println(horaDeUmaStringDespadronizada);
        System.out.println(horaDeUmaString);
    }
}
