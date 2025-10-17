package arrays_colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {
        Map<String, String> estados = new HashMap();
        estados.put("SP", "Sao paulo");
        estados.put("RS", "Rio grande do sul");
        estados.put("SC", "Santa catarina");

        System.out.println(estados);
    }
}
