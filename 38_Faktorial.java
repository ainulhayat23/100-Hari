package pkg_Hari38;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Membuat program Faktorial sederhana
        // angka+ ! = >>>Dibaca Faktorial
        
        int angka;
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        angka = masuk.nextInt();
        int hasil = angka;
        System.out.print(angka+"! = ");
        for (int i = angka; i > 0; i--){
            System.out.print(i);
            
            if(i > 1){
                System.out.print(" x ");
            } 
            if(angka != i){
                hasil *= i;
            }
        }
        System.out.println("");
        System.out.print("   = "+hasil);
        
    }
}
