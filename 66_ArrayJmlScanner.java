package pkg_hari66;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int [] ArrayInt = new int [5];
        int total = 0;
        System.out.println("Masukkan angka yang ingin jumlahkan");
        for (int i = 0; i < ArrayInt.length; i++) {
            System.out.print("Array "+(i+1)+" : ");
            ArrayInt[i] = input.nextInt();
            total += ArrayInt[i];
        }
        System.out.println(Arrays.toString(ArrayInt));
        System.out.println("Hasil  : "+total);       
    }    
}
