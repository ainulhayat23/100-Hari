package pkg_hari90;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("[flags]");

        System.out.print("Masukkan angka1: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka2: ");
        int angka2 = input.nextInt();

        int hasil = angka1 + angka2;

        System.out.printf("%d + %d = %+d", angka1, angka2, hasil);

        input.close();
    }
}
