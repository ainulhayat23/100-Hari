package pkg_Hari20;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Konversi bilangan Desimal ke Biner
        
        Scanner input = new Scanner(System.in);
            int angka,i=0;
              int binary[] = new int [100];
                System.out.print("Masukkan angka desimal : ");
                  angka = input.nextInt();
         
        while(angka!=0){
            binary[i] = angka%2;
               angka = angka/2;
                 i++;}
        
        System.out.print("Angka binernya adalah : ");
              for (int j=i-1;j>=0;j--){
                  System.out.print(""+binary[j]);}
    }
}
