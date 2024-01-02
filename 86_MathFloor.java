package pkg_hari86;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan angka desimal: ");
        double angka = masuk.nextDouble();

        double hasilFloor = Math.floor(angka);

        System.out.println("Hasil floor dari " + angka + " adalah: " + hasilFloor);
    }
}
