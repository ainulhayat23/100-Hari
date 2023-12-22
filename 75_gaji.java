package pkg_hari75;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan gaji : Rp. ");
        double gajipokok = masuk.nextDouble();
        
        System.out.print("Lama lembur (Jam) : ");
        int lembur = masuk.nextInt();
        
        double gajilemburPerjam = 55000;
        
        double gajilembur = lembur * gajilemburPerjam;
        double gajibersih = gajipokok + gajilembur;
        System.out.println("Gaji bersih : Rp."+ gajibersih);
    }
}
