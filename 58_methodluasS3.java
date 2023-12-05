package pkg_hari58;
import java.util.Scanner;
public class Main {
    
    // Method yang menerima alas dan tinggi sebagai nilai awal
    // kemudian mengembalikan luas dari segitiga

        public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Alas   : ");
        double alas = input.nextInt();
        System.out.print("Tinggi : ");
        double tinggi = input.nextInt();
        luas(alas,tinggi);
    }
    private static double luas (double a,double t){
        double luas = (a*t)/2;
        System.out.println("Luas     : "+luas);
        return luas;
    }
}
