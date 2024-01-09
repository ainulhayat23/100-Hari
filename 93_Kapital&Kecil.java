package pkg_hari93;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner masuk = new Scanner(System.in);
        
        //Untuk to.UpperCase mengubah huruf kapital atau kecil
        System.out.print("Masukkan kalimat : ");
        String kalimat = masuk.nextLine();
        
        //toUpperCase untuk huruf Kapital
        System.out.println("toUpperCase : " + kalimat.toUpperCase());
        
        //toLowerCase untuk huruf kecil
        System.out.println("toLowerCase : " + kalimat.toLowerCase());
    }
 } 
