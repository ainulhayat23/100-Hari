 package pkg_Hari17;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Hari ini kita akan mengulas kembali mengenai materi Operator Ternary
        // Kita akan coba manfaatkan Operator ini untuk
        // mendeklarasikan sebuah variabel untuk menyimpan
        // hasil dari operasi sisa bagi terhadap angka yang akan kita tentukan.
        // Apakah dia adalah sebuah bilangan ganjil atau bilangan genap??
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan Angka = ");
        int angka = masuk.nextInt();
        
        
        int hasil = angka % 2;
        String kondisi = hasil == 0?"Genap" : "Ganjil";
        System.out.println("Angka ini adalah bilangan " + kondisi);
        
        // Mungkin untuk hari, logika yang saya pelajari
        // Jika ada kesalahan mohon untuk dikoreksi
        // Terima Kasih
        
    }
}
