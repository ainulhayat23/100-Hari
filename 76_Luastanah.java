package pkg_hari76;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner masuk = new Scanner(System.in);
        // Luas tanah permeter = 300.000
        System.out.print("Masukkan luas tanah : ");
        int luas = masuk.nextInt() * 300000;
        int pajak = 0;
        if(luas >= 100000000){
            System.out.println("Kena pajak 5%");
            pajak = luas * 5/100;
        }else if(luas >= 50000000){
            System.out.println("Kena pajak 3%");
            pajak = luas * 3/100;
        }else{
            System.out.println("Tidak kena pajak");
            pajak = luas * 1/100;
        }
        
        System.out.print("Total bersih : Rp."+(luas - pajak));
        
        }
    }
