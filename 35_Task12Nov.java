package pkg_Hari35;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, total = 0;
        
        System.out.print("Batas Angka : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i += 2) {
            total += i;
        }
        System.out.println("Penjumlahan bilangan ganjil dari 1 sampai " + n + " adalah: " + total);
    
    }    
}
