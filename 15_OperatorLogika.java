 package pkg_Harike15;
public class Main{
    
    public static void main(String[] args) {
        
        // Hari ini kita akan mempelajari tentang
        // Operator Logika,saya akan menjelaskan 
        // operator yang paling sering digunakan
        // Yaitu
        // NOT dilambangkan dengan tanda ( ! ) 
        // AND dilambangkan dengan tanda ( && )
        // OR dilambangkan dengan tanda ( || )
        
        // Tanda NOT ini adalah kebalikan jadi jika 
        // nilai itu adalah true maka saat dicetak akan menghasilkan nilai false
        // begitupun sebaliknya
        
        
        System.out.println("Operasi logika NOT ( ! )");
        boolean lulus = true;
        System.out.println(!lulus);
        boolean hasil = false;
        System.out.println(!hasil);
        System.out.println("========================");
        
        
        // Tanda AND digunakan jika semua kondisi nilai adalah true
        // maka akan mencetak nilai true sebaliknya jika hanya 
        // salah satu nilai adalah true maka akan mencetak nilai false
        
        System.out.println("Operasi logika AND (&&)");
        boolean a = true;
        boolean b = false;
        boolean c = a && b;
        System.out.println(c);
        // 1 x 0 = 0
        
        boolean d = true;
        boolean e = true;
        boolean f = d && e;
        System.out.println(f);
        // 1 x 1 = 1
        
        
        boolean g = false;
        boolean h = false;
        boolean i = g && h;
        System.out.println(i);
        // 0 x 0 = 0
        System.out.println("========================");
        
        // nah AND ini dapat kita ibaratkan menjadi sebuah perkalian
        // dimana nilai true = 1 dan false = 0,dimana jika kita
        // kalikan 1 x 0 maka akan menghasilkan angka 0
        
        
        // Next ada OR nah OR ini dapat kita ibaratkan sebagai sebuah 
        // Operasi Penjumlahan biner, contoh:
        
        System.out.println("Operasi Logika OR (||)");
        boolean j = true;
        boolean k = true;
        boolean l = j || k;
        System.out.println(j);
        // 1 + 1 = 2
        
        boolean m = true;
        boolean n = false;
        boolean o = m || n;
        System.out.println(o);
        // 1 + 0 = 1
        
        boolean p = false;
        boolean q = false;
        boolean r = p || q;
        System.out.println(r);
        // 0 + 0 = 0
        System.out.println("==========================");
        
        // Nah OR ini akan berhasil dijalankan jika 
        // salah satu syarat terpenuhi.
        
        
        // Mungkin hanya ini yg bisa saya jelaskan untuk hari ini
        // Jika ada kesalahan mohon dikoreksi 
        // Terima Kasih
        
        
    }
    
}
