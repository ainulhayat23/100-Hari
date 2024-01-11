package pkg_hari95;
public class Main {
    public static void main(String[] args) {
        
        // Inisialisasi StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // Menambahkan string ke StringBuilder
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World!");

        // Mendapatkan hasil akhir sebagai String
        String result = stringBuilder.toString();

        // Menampilkan hasil
        System.out.println(result);
    }
}
