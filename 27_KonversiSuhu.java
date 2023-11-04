package pkg_Hari27;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
            int pilihan=0, celcius;
            while(pilihan!=4){
            float fahreinhet, kelvin, reamur;
            System.out.println("==================");
            System.out.println("Opsi Konversi Suhu");
            System.out.println("==================");
            System.out.println("1. Celcius To Fahreinhet");
            System.out.println("2. Celcius To Kelvin");
            System.out.println("3. Celcius To Reamur");
            System.out.println("4. Keluar");
            System.out.println("==================");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = input.nextInt();
            
            switch(pilihan){
                case 1:
                    System.out.print("Masukkan derajat celcius : ");
                    celcius = input.nextInt();
                    fahreinhet = 9f/5f * celcius + 32f;
                    System.out.println("Fahreinhet derajat : "+ fahreinhet);
                    break;
                case 2:
                    System.out.print("Masukkan derajat celcius : ");
                    celcius = input.nextInt();
                    kelvin = celcius + 273f;
                    System.out.println("Kelvin derajat : "+ kelvin);
                    break;
                case 3:
                    System.out.print("Masukkan derajat celcius : ");
                    celcius = input.nextInt();
                    reamur = 4f/5f * celcius;
                    System.out.println("Reamur derajat : "+ reamur);
                    break;
            }       
            }
            System.out.println("Program selesai");
   }  
}
