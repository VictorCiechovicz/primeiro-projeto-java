package java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaTimeTransforme {
    public static void main(String[] args) {

        LocalDate dataHora = LocalDate.now();
        esperaDataHora(dataHora.atTime(20, 0));

    }

    static void esperaDataHora(LocalDateTime data) {
        System.out.println(data);
    }
}
