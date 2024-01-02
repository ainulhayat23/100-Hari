package pkg_hari86;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka desimal: ");
        double angka = scanner.nextDouble();

        double hasilFloor = Math.floor(angka);

        System.out.println("Hasil floor dari " + angka + " adalah: " + hasilFloor);

        scanner.close();
    }
}
