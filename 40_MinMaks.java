package pkg_Hari40;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Program Maksimal dan Minimal
        
        int jml, angka, maksimal= 0, minimal = 1000;
        
        System.out.print("Jumlah Angka : ");
        jml = input.nextInt();
        System.out.println("---------------");
        for(int i = 1; i <= jml; i++){
            System.out.print("Angka ke-"+i+" = ");
               angka = input.nextInt();
          
        if(angka > maksimal){
            maksimal = angka;
        }
            
        if(angka < minimal){
            minimal = angka;
        }
            
        } 
        System.out.println("----------------");
        System.out.println("Maksimal = "+maksimal);
        System.out.print("Minimal  = "+minimal);
    }    
}
