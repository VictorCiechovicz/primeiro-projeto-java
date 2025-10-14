package java_time;

import java.time.LocalDateTime;

public class LocalDateTimeSample {
    public static void main(String[] args) {

        // 2023-06-25T16:25 -> data e hora sem segundo
        LocalDateTime dataHora = LocalDateTime.of(2023, 6, 25, 16, 25);
        // 2023-06-25T16:25:33 -> data e hora com segundo
        dataHora = LocalDateTime.of(2023, 6, 25, 16, 25, 33);
        System.out.println(dataHora);

        //Manipulacao

        LocalDateTime proximoMes = dataHora.plusMonths(1);
        LocalDateTime dataHoraComMenos15Minutos = dataHora.minusMinutes(15);
        LocalDateTime dataHoraDefinindoSegundoZero = dataHora.withSecond(33);
        System.out.println(dataHoraDefinindoSegundoZero);
    }
}
