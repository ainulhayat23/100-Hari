 package pkg_Harike13;
public class Main{
    
    public static void main(String[] args) {
        
        // Hari ini kita akan mempelajari tentang
        // Increment dan Decrement
        // Increment dibagi menjadi dua bagian yaitu:
        // Post Increment = a++
        // Pre Increment = ++a
        // Decrement pun demikian
        // Post Decrement = a--
        // Pre Decrement = --a
        
        System.out.println("Post Increment = ");
        // o = p; p = p + 1
        int o;
        int p = 5;
        o = ++p;
        System.out.println(o);
        System.out.println(p+"\n");
        
        System.out.println("Pre Increment = ");
        // y = y + 1; y = u;
        int y;
        int u = 7;
        y = u++;
        System.out.println(y);
        System.out.println(u+"\n");
        
        System.out.println("Post Decrement = ");
        // w = q; w = w - 1
        int q;
        int w = 8;
        q = --w;
        System.out.println(q);
        System.out.println(w+"\n");
        
        System.out.println("Pre Decrement = ");
        // b = b - 1; b = z;
        int z;
        int b = 9;
        z = w--;
        System.out.println(o);
        System.out.println(p+"\n");
        
        //Mungkin cuma ini yg bisa pelajari hari ini
        //Kalau ada kesalahan mohon dikoreksi
        //Terima kasih
        
        
    }
    
}
