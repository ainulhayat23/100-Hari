 package pkg_Hari8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Kita akan mempelajari tentang Menghitung Luas dan Keliling persegi
        //Rumus :
        // L = s x s
        // K = 4 x s
        
        
        Scanner input = new Scanner(System.in);
        int s,L,K;
        System.out.print("masukkkan s = ");
        s = input.nextInt();
        L = s * s;
        K = 4 * s;
        
        //Narasi Luas Persegi
        System.out.println("L = s x s");
        System.out.println("L = "+s+" x "+s);
        System.out.println("L = " + L +" Cm²\n");
        
        
        //Narasi Keliling Persegi
        System.out.println("K = 4 x s");
        System.out.println("K = "+4+" x "+s);
        System.out.println("K = " + K +" Cm²\n");

        //Mungkin cuma ini yang bisa saya pelajari untuk hari ini
        //Terima kasih
        
    }
}
