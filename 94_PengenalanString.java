package pkg_hari94;
public class Main {
    public static void main(String[] args) {
        
        String nama = "Liverpool";
        
        System.out.println("Panjang string: " + nama.length());
        System.out.println("Karakter pertama: " + nama.charAt(0));
        
        String tambahanString = " Klub bola terbaik saat ini!";
        System.out.println("Kalimat lengkap: " + nama + tambahanString);
        
        System.out.println("Apakah string sama? " + nama.equals("Liverpool"));
    }
}
