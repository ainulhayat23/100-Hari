package pkg_Hari45;

public class Main {
    public static void main(String[] args) {
        
        // Menentukan angka Maks dan Min menggunakan Array
        // secara manual tapi
        
        int[]a = {35,1,8,7,85,36,134,9,7,4,78,51,23,-23,6,80};
        int jml_index = a.length;
        System.out.println("Jumlah Index : "+jml_index);
        System.out.println("=====================");
        int max = a[0], min = a[0];
        System.out.print("Deret bilangan : ");
        
        
        for(int i = 0; i<jml_index; i++){
            System.out.print(a[i]+" ");
            
            if (a[i] > max){
                max = a[i];
            } 
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("");
        System.out.println("=====================");
        System.out.println("Bilangan Max : "+max);
        System.out.println("Bilangan Min : "+min);
      
    }
}
