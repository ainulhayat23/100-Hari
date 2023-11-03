package pkg_Hari26;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Switch case MENU pada pemrograman java
        
        Scanner masuk = new Scanner(System.in);
        int pilihan, porsi, harga=0;
            
        System.out.println("======================");
        System.out.println("-----MENU MAKANAN-----");
        System.out.println("======================\n");
          System.out.println("1. Bakso\n2. Nasi Goreng\n3. Mie Ayam\n");
           System.out.print("Pilih : ");
            pilihan = masuk.nextInt();
        
        switch(pilihan){
            case 1:
             System.out.print("Porsi : ");
              porsi = masuk.nextInt();
               System.out.println("\nBakso 8K/Porsi\n");
                 harga = 8000 * porsi;
                  break;
            case 2:
             System.out.print("Porsi : ");
              porsi = masuk.nextInt();
               System.out.println("\nNasi Goreng 13K/Porsi\n");
                 harga = 13000 * porsi;
                  break;    
            case 3:
             System.out.print("Porsi : ");
              porsi = masuk.nextInt();
               System.out.println("\nMie Ayam 10K/Porsi\n");
                 harga = 10000 * porsi; 
                  break;
            default:
                System.out.println("Pilihan salah");
                  break;
        }
        System.out.println("Total harga = "+harga);
   }
    
}
