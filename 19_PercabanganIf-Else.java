 package pkg_Hari19;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Hari ini kita akan mempelajari tentang materi 
        // Percabangan IF ELSE didalam tiga kondisi yang berbeda
        // kita akan ambil contoh soal total belanja yang 
        // diberikan diskon saat mencapai harga tertentu
        
        // Struktur IF ELSE 
        // • IF atau bisa disebut JIKA, itu digunakan hanya untuk satu kondisi saja
        // if(Kondisi){
        //      [Aksi]
        // }
        
        // • IF dan Else, itu digunakan pada dua kondisi yang berbeda
        // if(Kondisi){
        //       [Aksi]
        // } else{
        //       [Aksi]
        // }
        
        // • IF, ELSE IF, ELSE digunakan pada saat dalam 3 kondisi yang berbeda
        // atau bahkan lebih
        // if (Kondisi){
        //        [Aksi]
        // }else if{
        //       [Aksi]
        // }else{
        //       [Aksi]
        // }
        
        
        
        Scanner masuk = new Scanner(System.in);
             System.out.print("Masukkan total belanja : ");
        
        double total = masuk.nextDouble();
             System.out.print("Total belanja anda = Rp."+total);
        
        if(total >= 500000){
          System.out.println("Dapat diskon 20% ");
             double diskon = 20 * total / 100;
                total -= diskon;
            
        } else if(total >= 250000){
            System.out.println("Dapat diskon 15% ");
              double diskon = 15 * total / 100;
                total -= diskon;
            
        } else if(total >= 100000){
            System.out.println("Dapat diskon 10% ");
              double diskon = 10 * total / 100;
                total -= diskon;
            
        } else {
           System.out.println("Tidak dapat diskon");
            
        } System.out.println("Jadi total keseluruhan = Rp."+total);
        
        // Mungkin untuk hari pembahasan tentang percabangan
        // IF ELSE jika ada kesalahan mohon untuk dikoreksi
        // Terima Kasih
        
    }
}
