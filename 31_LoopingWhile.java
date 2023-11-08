package pkg_Hari31;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Looping While atau perulangan pada Java
        
        Scanner masuk = new Scanner(System.in);
        
        int awal,akhir;
        
        System.out.print("Angka Awal  : ");
        awal = masuk.nextInt();
        
        System.out.print("Angka Akhir : ");
        akhir = masuk.nextInt();
        
        if(akhir > awal){
            System.out.println("Inputan Salah");
        } else {
            int b = awal;
            while(b >= akhir){
                System.out.print(b+" ");
                b--;
            }
        }
        System.out.println(" ");
    }    
}
        
