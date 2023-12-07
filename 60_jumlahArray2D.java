package pkg_hari60;
public class Main {
    public static void main(String[] args) {
        
    // Mencari hasil penjumlahan dari double Array dibawah
        
    int [][] angka = {{1,2,3},{4,5,6},{7,8,9}};
    int keseluruhan = 0;
    for(int i = 0; i < angka.length; i++) {
      for(int j = 0; j < angka[i].length; j++){
        System.out.print(angka[i][j]+ " ");
          keseluruhan += angka[i][j];
    }
        
    System.out.println(" ");
        
    }
        
    System.out.println("===================");
    System.out.println("Hasil : "+keseluruhan);
        
    }
    
}
