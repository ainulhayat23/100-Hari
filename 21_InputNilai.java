package pkg_Hari21;
import java.util.Scanner;
public class Main {
    
    // Input nilai mahasiswa pada pemrograman java
    // Dengan menggabung beberapa operator seperti :
    // Scanner, Operator pembanding dan Percabangan if else
    // NB : Rata rata diperoleh
    // 30% untuk Presensi, 30% untuk tugas dan 40% untuk UAS
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          String nama, nim, matkul;
           final double n_presensi, n_tugas, n_uas, n_akhir;
        
        System.out.println("====INPUT NILAI MAHASISWA====");
                    
        System.out.print("Masukkan Nama  : ");
         nama = input.nextLine();
         
        System.out.print("Masukkan NIM   : ");
         nim = input.nextLine();
         
        System.out.print("Mata Kuliah    : "); 
         matkul = input.nextLine();
         
        System.out.print("Nilai Presensi : ");
         n_presensi = input.nextDouble();
         
        System.out.print("Nilai Tugas    : ");
         n_tugas = input.nextDouble();
         
        System.out.print("Nilai UAS      : ");
         n_uas = input.nextDouble();
         
        n_akhir = (0.30 * n_presensi + 0.30 * n_tugas + 0.40 * n_uas);
            System.out.println("Rata rata nilai anda adalah "+ n_akhir);
        
        String predikat = 
                n_akhir < 0 ? "Nilai Salah":
                n_akhir > 100 ? "Nilai Salah":
                n_akhir >= 85 ? "Sangat Baik":
                n_akhir >= 80 ? "Baik":
                n_akhir >= 70 ? "Cukup":
                n_akhir >= 60 ? "Kurang" : "Error";
        
        System.out.println("Predikat nilai anda "+ predikat);
 
          if (n_akhir >= 85 || n_akhir >= 80 || n_akhir >= 70){
              System.out.println("Dan anda Dinyatakan lulus");
        } 
          else{
              System.out.println("Dan anda Dinyatakan tidak lulus ");}
    }
}
