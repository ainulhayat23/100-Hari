package pkg_Hari43;
public class Main {
    public static void main(String[] args) {
        
        //Menghitung rata rata pada Array 1 Dimensi
        
        int [] a = {6,4,5,2,4,9,8,7,6,5,3,21,2,3};
        int total = 0;
        double rata;
        int jml_index = a.length;
        System.out.println("Jumlah index \t: "+a.length);
        
        System.out.print("Deret angka \t: ");
        for(int i=0; i < jml_index; i++){
            System.out.print(a[i]+" ");
              total += a[i];
        }  
        System.out.println("");
        System.out.println("Total jumlah \t: "+total);
        rata = total/jml_index;
        System.out.print("Rata-rata \t: "+rata);
        
    }
}
