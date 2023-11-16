package pkg_Hari39;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Rata Rata nilai menggunakan Looping
        
        Scanner sc = new Scanner(System.in);
        int jml;
        double nilai, total = 0, rataRata;
        System.out.print("Berapa Nilai : ");
        jml = sc.nextInt();
        for(int i=1; i<=jml; i++){
            System.out.print("Nilai ke-"+i+"  = ");
              nilai = sc.nextDouble();
                total += nilai;
        }
        rataRata = total / jml;
        System.out.println("Total       = "+total);
        System.out.print("Rata - rata = "+rataRata);
    }
}
