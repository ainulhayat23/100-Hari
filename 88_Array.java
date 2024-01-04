package pkg_hari88;
public class Main {
    public static void main(String[] args) {
        int angka [] = {56, 72, 24, 86, 39, 10, 73, 165, 45};
        int total = 0;
        
        for(int x : angka){
            total += x;
        }
        System.out.println("Total penjumlahan = " + total);
    }
}
