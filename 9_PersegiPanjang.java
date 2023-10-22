 package pkg_Hari9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Kita akan mempelajari tentang menghitung
        //Luas dan keliling persegi panjang dengan rumus =
        //L = p x l
        //K = 2 x (p + l)
        
        Scanner input = new Scanner(System.in);
        
        int p,l,L,K;
        System.out.print("masukkan p = ");
        p = input.nextInt();
        System.out.print("masukkan l = ");
        l = input.nextInt();
        
        L = p * l;
        K = 2 * (p + l);
        
        System.out.println("L = p x l");
        System.out.println("L = " + p +" x "+ l);
        System.out.print("L = ");
        System.out.println(L + "\n");
        
        
        System.out.println("K = 2 x (p + l)");
        System.out.println("K = 2 x ("+p+" + "+l+")");
        System.out.print("K = ");
        System.out.print(K + "\n");
        
        
        //Mungkin untuk hari ini yang dapat saya pelajari
        //masih mau dipermantap untuk kedepannya
        //Terima kasih
        
        
    }
}
