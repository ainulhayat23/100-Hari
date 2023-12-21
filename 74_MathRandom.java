package pkg_hari74;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        //Math Random
        
        Scanner masuk = new Scanner(System.in);
        
      System.out.print("Masukkan nilai x : ");
      int x = masuk.nextInt();
      System.out.print("Masukkan nilai y : ");
      int y = masuk.nextInt();
      int angka = x + (int)(Math.random()*((y-x)+1));
      System.out.println("Angka random : "+angka);
    }
}
