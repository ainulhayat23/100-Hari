package pkg_Hari30;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Looping for atau perulangan pada Java
        
        Scanner masuk = new Scanner(System.in);
        
        int awal,akhir;
        
        System.out.println("Bilangan Genap");
        
        System.out.print("Angka Awal  : ");
        awal = masuk.nextInt();
        
        System.out.print("Angka Akhir : ");
        akhir = masuk.nextInt();
        
        if(awal < akhir){
        for(int a = awal; a <= akhir; a++){
            int hasil = a % 2;
            if(hasil==0){
                System.out.print(a+" ");
            }
        }
        System.out.println("");
        
        }else{
            System.out.println("Awal > Akhir");
        }
    }    
}
        
