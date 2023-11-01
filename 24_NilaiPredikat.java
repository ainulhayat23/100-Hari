package pkg_Hari24;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           int nilai;
              String predikat = null;
        
        System.out.println("=====================");
        System.out.println("--------INPUT--------");
        System.out.println("=====================\n");
        System.out.print("Masukkan Nilai : ");
        nilai = input.nextInt();
        
        if(nilai > 100){
            predikat = "Nilai Overload";
        }else if(nilai < 0){
            predikat = "Nilai salah";
        }else if(nilai >= 85){
            predikat = "Sangat baik";
        }else if(nilai >= 70){
            predikat = "Baik";
        }else if(nilai >= 60){
            predikat = "Cukup";
        }else if(nilai < 60){
            predikat = "Kurang";
        }
        
        System.out.println("\n=====================");
        System.out.println("--------OUTPUT-------");
        System.out.println("=====================\n");
        System.out.println("Nilai \t\t: "+ nilai);
        System.out.println("Predikat \t: "+ predikat);
        
        // Pembahasan terakhir kita mengenai IF ELSE
        // Next Kita akan mempelajari tentang percabangan Switch Case
        
        
    }  
}
