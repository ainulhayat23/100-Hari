package pkg_Hari29;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Looping for atau perulangan pada Java
        
        Scanner masuk = new Scanner(System.in);
        int awal,akhir;
        System.out.println("Range Angka");
        System.out.print("Angka Awal  : ");
        awal = masuk.nextInt();
        System.out.print("Angka Akhir : ");
        akhir = masuk.nextInt();
        for(int a = awal; a <= akhir; a++){
            System.out.print(a+" ");
        }
    }    
}
        
