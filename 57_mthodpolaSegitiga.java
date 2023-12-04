package pkg_hari57;
import java.util.Scanner;
public class Main {
    
    // Mencari pola segitiga menggunakan method Prosedur dan Fungsi

        public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga : "); 
        int tinggiSegitiga = input.nextInt();

        polaSegitiga(tinggiSegitiga);
    }

    static void polaSegitiga(int tinggi) {
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("o ");
            }
            System.out.println();
        }
    }
}
