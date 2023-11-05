package pkg_Hari28;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Harga beras per karung adalah Rp.500.000
        akan mendapat diskon sebesar 3% jika membeli 150 karung beras 
        dan akan mendapat diskon lagi sebesar 7% jika membeli 300 karung beras
        */
        
      Scanner masuk = new Scanner(System.in);
      int hargaBeras;
      int jumlahBeras = 0, total = 0;
      double diskon;
      hargaBeras = 500000;
        System.out.print("Total Beras yang dibeli : ");
            jumlahBeras = masuk.nextInt();
                diskon = 0;
         
     if(jumlahBeras>=150 && jumlahBeras<300){
        System.out.println("Anda dapat diskon sebesar 3%");
            diskon = 0.03 * (hargaBeras * jumlahBeras);
                int diskonAnda = (int)diskon;
                    total = (hargaBeras * jumlahBeras) - diskonAnda;
                    
    }else if(jumlahBeras>=300){
        System.out.println("Anda dapat diskon sebesar 7%");
            diskon = 0.07 * (hargaBeras * jumlahBeras);
                int diskonAnda = (int)diskon;
                    total = (hargaBeras * jumlahBeras) - diskonAnda;        
    }else{
         System.out.println("Tidak dapat diskon");
             total = hargaBeras * jumlahBeras;
    }
         System.out.println("Total harga yang harus dibayar Rp. : "+ total);  
        
    }    
}
        
