package pkg_Hari33;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Program Do While java.
        
        String nama, alamat, loop;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama   : ");
          nama = sc.nextLine();
            
        System.out.print("Alamat : ");
          alamat = sc.nextLine();
            
        System.out.println("--------------------------");
            
        System.out.println(nama + "tinggal di "+ alamat);
          System.out.print("Ulang y/n : ");
            loop = sc.next();
            
        } while (loop.equalsIgnoreCase("Y"));
        System.out.println("Program Selesai");
    }    
}
        
