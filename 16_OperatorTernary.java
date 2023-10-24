 package pkg_Hari16;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        //Hari ini kita akan mempelajari tentang
        //Cara mengoperasikan Operator Ternary
        //Dengan cara dibawah ini!!!!
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama = ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Kelas = ");
        String kelas = input.nextLine();
        
        System.out.print("Masukkan Nilai = ");
        int nilai = input.nextInt();
        
        int kkm = 70;
        String hasil = nilai>= kkm?"Lulus" : "Tidak Lulus";
        System.out.println(nama +"memperoleh nilai sebesar "+nilai);
        System.out.println("Dan "+ nama + "dinyatakan "+ hasil);
        String ulang = nilai>= kkm?"Tidak mengulang" : "Mengulang";
        System.out.println("Dan "+ ulang + " kelas");
        
        
        //Mungkin hanya ini yang bisa saya jelaskan untuk hari ini
        //kalau ada kesalahan mohon dikoreksi 
        //Terima kasih.....
        
    }
}
