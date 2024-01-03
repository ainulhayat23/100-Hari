package pkg_hari87;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan angka desimal: ");
        double inputNumber = masuk.nextDouble();

        // Menggunakan Math.round() untuk membulatkan angka
        long roundedNumber = Math.round(inputNumber);

        System.out.println("Angka awal: " + inputNumber);
        System.out.println("Angka setelah dibulatkan: " + roundedNumber);

        masuk.close();
    
    }
}
