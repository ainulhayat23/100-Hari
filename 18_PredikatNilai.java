 package pkg_Hari18;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        
        // Disini timbul pertanyaan apakah operator Ternary
        // Hanya bisa digunakan hanya dalam 2 kondisi saja? Jawabannya
        // Operator Ternary bisa digunakan lebih dari 2 kondisi
        // Selama program memenuhi syarat pasti bisa dijalankan
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();
        
        String predikat =
        nilai < 0 ? "Nilai salah":
        nilai > 100 ? "Nilai salah ":
        nilai >= 85 ? "Sangat baik ":
        nilai >= 80 ? "Baik ":
        nilai >= 75 ? "Cukup ":
        nilai >= 60 ? "Kurang ":
        "error";
        
        System.out.println("Nilai yang Anda dapatkan " + predikat);
        System.out.println("Catatan : Jika nilai kurang dari 60 maka dinyatakan mengulang");
        
        
        // Jika ada kesalahan mohon dikoreksi
        // Terima Kasih
        
        
        // Catatan : Mungkin ini pembahasan terakhir kita untuk operator Ternary
        // Selanjutnya kita akan membahas tentang
        // PERCABANGAN IF-ELSE.
        
    }
}
