package pkg_Hari51;
import java.util.Scanner;
public class Main {
    
    // Method Prosedur dan Fungsi X Aritmatika
    
    public static void operasi(double a, double b){
        double c;
        
        c = a + b;
        System.out.println(a+" + "+b+" = "+c);
        
        c = a - b;
        System.out.println(a+" - "+b+" = "+c);
    
        c = a * b;
        System.out.println(a+" x "+b+" = "+c);
    
        c = a / b;
        System.out.println(a+" : "+b+" = "+c);
    
        c = a % b;
        System.out.println(a+" % "+b+" = "+c);
    
    }
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        double a,b;
        System.out.print("Masukkan nilai a : ");
        a = masuk.nextDouble();
        System.out.print("Masukkan nilai b : ");
        b = masuk.nextDouble();
        System.out.println("\n=================");
        System.out.println("=====OUTPUT======");
        System.out.println("=================\n");
        operasi(a,b);
        
    }
}
