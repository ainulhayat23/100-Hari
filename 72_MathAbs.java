package pkg_hari72;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        //Jika nilai ekspresi negatif,
        //maka nilai absolutnya akan menjadi positif.
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan nilai x : ");
        int x = masuk.nextInt();

        int z = Math.abs(x);
        System.out.println("Nilai absolut dari x adalah : "+z);

        masuk.close();
    }
}
