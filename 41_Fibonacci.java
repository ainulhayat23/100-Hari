package pkg_Hari41;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Deret Fibonacci
        
        Scanner input = new Scanner(System.in);
        
        int f1 = 0;
        int f2 = 1;
        System.out.print("Jumlah Angka = ");
        int n = input.nextInt();
        System.out.println("---------------");
        
        int fn;
        System.out.println("Deret Fibonacci");
        System.out.println("---------------");
        System.out.print(f1+" , ");
        System.out.print(f2);
        for(int i=1; i<n; i++){
            fn = f1 + f2;
            System.out.print(" , "+fn);
            f1 = f2;
            f2 = fn;
        }
        System.out.println("");
    }
}
