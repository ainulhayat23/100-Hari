package pkg_Hari42;
public class Main {
    public static void main(String[] args) {
        
        // Pembahasan kali ini mengetahui jumlah index Array
        // menggunakan looping
        
        // Jumlah Array yg akan dimasukkan atau yang biasa disebut
        // dengan index,kemudian index dimulai dari angka nol,jdi
        // 0 = 1, 
        // 1 = 5, 
        // 2 = 0, 
        // 3 = 6 dan seterusnya
        
        int [] a = {1, 5, 0, 6, 8, 9};
        
        // length berupa kode untuk mengetahui jumlah
        // index yang ada didalam array a
        
        int jml = a.length;
        System.out.println("Jumlah index yang ada dalam array adalah : "+jml);
        
        for (int i=0; i<jml; i++){
            System.out.println("Index "+a[i]);
            
        }
    }
}
