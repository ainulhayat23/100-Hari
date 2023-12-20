package pkg_hari73;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Membulatkan angka keatas
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        double angka = input.nextDouble();
        double hasilpembulatan = Math.ceil(angka);
        System.out.print("Angka setelah dibulatkan ke atas : "+hasilpembulatan);
    
    }
}
