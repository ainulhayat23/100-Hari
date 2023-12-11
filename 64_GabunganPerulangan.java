package pkg_hari64;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        
        int[] numbers = {87, 65, 23, 91, 14};
        System.out.println("Menggunakan for : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Menggunakan for-each : ");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Menggunakan perulangan while :");
        int j = 0;
        while (j < numbers.length) {
            System.out.println(numbers[j]);
            j++;
        }
        System.out.println("Menggunakan Do-while :");
        int k = 0;
        do {
            System.out.println(numbers[k]);
            k++;
        } while (k < numbers.length);
        System.out.println("Menggunakan Arrays : ");
        System.out.println(Arrays.toString(numbers));
    }
}
