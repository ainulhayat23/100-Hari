package pkg_Hari36;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Membuat pola Segitiga menggunakan Looping
        
        System.out.print("Masukkan Angka : ");
        int jml = sc.nextInt();
        
        System.out.println("------------------");
        System.out.println("------OUTPUT------");
        System.out.println("------------------");
        for(int i = 1; i <= jml; i++){
            for(int j = 1; j < i; j++){
               System.out.print("o ");
            }
            System.out.println("o");
        }
    }
}
