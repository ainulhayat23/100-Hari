package pkg_hari89;
public class Main {
    public static void main(String[] args) {
        
        String nama = "Ainul";
        int umur = 18;
        double tinggi = 165.9;

        // Menggunakan String.format()
        String hasilFormat = String.format("Nama: %s, Umur: %d, Tinggi: %.2f", nama, umur, tinggi);
        System.out.println(hasilFormat);
    }
}
