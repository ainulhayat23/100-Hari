package pkg_Hari46;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Program sederhana Searching Array 
        
        Scanner input = new Scanner(System.in);
        int cari, count = 0;
        
        int [] a = {4,3,6,8,3,9,1,5,2,7};
        System.out.print("Data : ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.print("Cari data : ");
        cari = input.nextInt();
        System.out.println("======================");
        System.out.print("Hasil cari : ");
        for(int i = 0; i < a.length; i++){
            if(cari == a[i]){
                System.out.println("Index ke-"+i);
                count++;
            }
        }
            if(count == 0){
                System.out.print("Data tidak tersedia");
            
        }
    }
}
