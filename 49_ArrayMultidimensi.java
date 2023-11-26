package pkg_Hari49;
public class Main {
    public static void main(String[] args) {
        
        // Array Multidimensi pada pemrograman java
        // dapat diibaratkan array multidimensi ini seperti
        // menentukan titik koordinat
        
        // Array multidimensi dapat dibuat seperti dibawah ini
        
        System.out.println("Cara pertama : \n");
        
        String [][] buah = new String[2][2];
        buah [0][0] = "Jeruk";
        buah [0][1] = "Mangga";
        buah [1][0] = "Kelapa";
        buah [1][1] = "Apel\n";
        
        System.out.println(buah[0][0]);
        System.out.println(buah[0][1]);
        System.out.println(buah[1][0]);
        System.out.println(buah[1][1]);
        System.out.println("==================\n");
        
        // atau seperti ini
        // Nama -> alamat
        // Yayat -> Majene
        
        System.out.println("Cara kedua :\n");
        
        String [][] alamat = {
            {"Nunez","\t- Uruguay"},
            {"Gakpo","\t- Belanda"}
        };
        
        System.out.print(alamat[0][0]);
        System.out.println(alamat[0][1]);
        System.out.print(alamat[1][0]);
        System.out.print(alamat[1][1]);
        
    }
}
