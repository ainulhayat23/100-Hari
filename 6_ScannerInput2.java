 package pkg_Harike6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        
        //Hari ini kita Ulas dan latihan kembali tentang 
        //cara untuk input data pada pemrograman java
        //dengan cara dibawah ini!!!!
        
        Scanner input = new Scanner(System.in);
        String nama, alamat;
        int umur;
        double berat;
        
        System.out.print("nama \t: ");
        nama = input.nextLine();
        
        System.out.print("alamat \t: ");
        alamat = input.nextLine();
        
        System.out.print("umur \t: ");
        umur = input.nextInt();
        
        System.out.print("berat \t: ");
        berat = input.nextDouble();
        
        System.out.println("=======================");
        System.out.println(nama+ " alamat "+alamat);
        System.out.println("Berumur "+umur+ " tahun");
        System.out.println("Dengan Berat "+berat+ " kg");
        
        //Mungkin hanya ini yang dapat saya kerjakan Hari ini
        // Terima kasih banyak
    }
    
}
