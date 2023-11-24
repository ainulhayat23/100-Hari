package pkg_Hari47;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Program sederhana Searching Array 
        // menggunakan tipe data String
        
        Scanner input = new Scanner(System.in);
        
        String [] a = {
            "tempe",
            "tahu",
            "ikan",
            "telur",
            "ayam",
        };
        for(int i = 0; i < a.length; i++){
            System.out.println(i+1+". "+a[i]);
        }
        String cari;
        int deteksi = 0;
        System.out.println("================");
        System.out.print("Cari Lauk : ");
        cari = input.nextLine();
        for(int i = 0; i < a.length; i++){
            if(cari.equalsIgnoreCase(a[i])){
                System.out.print("Nomor "+(i+1));
                deteksi++;
                
             }
            
          }
            if(deteksi == 0){
                System.out.print("Tidak valid");
        }
    }
}
