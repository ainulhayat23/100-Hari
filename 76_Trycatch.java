package pkg_hari76;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nilai x : ");
        int x = masuk.nextInt();
        System.out.print("Masukkan nilai y : ");
        int y = masuk.nextInt();
        int z = x /y;
      try {
          z = x / y;
          System.out.println("hasil = "+z);
      }catch(Exception e){
          System.out.println("pembagian salah");
      }
    } 
}
