package tipos_wrapeers;

public class TiposWrapeers {
    public static void main(String[] args) {

        //conversao explicita
        double numeroDouble = 12.00;
        int numeroInt = (int) numeroDouble;
        System.out.println(numeroInt);

        String numeroStringInt = "123";
        String numeroStringDouble = "123.123";
        int num = Integer.parseInt(numeroStringInt);
        double numDouble = Double.parseDouble(numeroStringDouble);
        System.out.println(numDouble);
        System.out.println(num);

        //comparacao
        Integer obj1 = Integer.valueOf(123);
        Integer obj2 = Integer.valueOf(123);

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.compareTo(obj2));

    }
}
