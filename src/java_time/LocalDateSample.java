package java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //Convertendo data de string
        String dataString = "14/10/2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataConcreta = LocalDate.parse(dataString, formatter);
        System.out.println(dataConcreta);


        //Comparando datas
        LocalDate data1 = LocalDate.of(2023, 3, 4);
        LocalDate data2 = LocalDate.of(2024, 4, 3);
//data2 está após a data 1? true
        System.out.println(data2.isAfter(data1));
//data2 está antes que data 1? flase
        System.out.println(data2.isBefore(data1));
//data2 é igual a data 1? false
        System.out.println(data2.isEqual(data1));


        //Formatacoes

        LocalDate data = LocalDate.of(2023, 1, 13);

        String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));  // 13 de janeiro de 2023
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));  // 13 de jan. de 2023
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));  // 13/01/2023
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));  // sexta-feira, 13 de janeiro de 2023

        System.out.println(dataFormatada);


        //Capturar dados especificos
        LocalDate dataEspecifico = LocalDate.of(2021, 8, 23);

        System.out.println(dataEspecifico.getDayOfMonth());   // retorna o dia do mês -> 23
        System.out.println(dataEspecifico.getYear());         // retorna o ano -> 2023
        System.out.println(dataEspecifico.getMonth());        // retorna o elemento de enum java.time.Month -> AUGUST
        System.out.println(dataEspecifico.getMonthValue());   // retorna o número do mês entre 1-12 -> 8
    }
}
