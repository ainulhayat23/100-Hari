package pkg_Hari32;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Latihan Looping While
        
        Scanner input = new Scanner(System.in);
        int awal, akhir, split;
        System.out.println("Bilangan Genap");
        System.out.print("Awal  : ");
        awal = input.nextInt();
        System.out.print("Akhir : ");
        akhir = input.nextInt();
        int a = awal;
        split = 1;
        while(a <= akhir){
            int hasil = a % 2;
            if(hasil == 0 ){
                System.out.print(a+" ");
                if(split == 5){
                    System.out.println("");
                    split = 0;
                }
                split++;
            }
            a++;
        } 
        System.out.println("");
    }    
}
        
