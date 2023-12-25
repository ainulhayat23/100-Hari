package pkg_hari78;
import java.util.Scanner;
public class Main {
    
        public static void main(String[] args) {
        System.out.print("Masukkan Nama: ");
        String nama = nama();
        System.out.println("Nama: " + nama);

        System.out.print("Masukkan Umur: ");
        int umur = umur();
        System.out.println("Umur: " + umur + " Tahun");
            
        System.out.print("Masukkan Berat: ");
            double berat = berat(); 
            System.out.println("Berat: " + berat + " Kg");
    }

    public static String nama() {
        return new Scanner(System.in).nextLine();
    }

    public static int umur() {
        return new Scanner(System.in).nextInt();
        
    }
    
    public static double berat(){
        return new Scanner(System.in).nextDouble();
        
    }
}
