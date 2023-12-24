package pkg_hari77;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        
        // Buat program Java untuk mencari 
        // bilangan terbesar kedua dalam suatu array.
        int[] arr = {-89, 54, 70, 34, 90};
        int max2 = arr[0];

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }

}
