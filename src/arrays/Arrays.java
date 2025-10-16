package arrays;

public class Arrays {


    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
    }
}
