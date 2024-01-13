package pkg_hari97;
public class Main {
    public static void main(String[] args) {
        
        int angka = 5;
        long hasilFaktorial = hitungFaktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah: " + hasilFaktorial);
    }

    public static long hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            // Basis: Faktorial dari 0 atau 1 adalah 1
            return 1;
        } else {
            // Rekursif: Faktorial dari n adalah n * faktorial(n-1)
            return n * hitungFaktorial(n - 1);
        }
    }
}
