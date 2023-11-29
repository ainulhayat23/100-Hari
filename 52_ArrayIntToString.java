package pkg_Hari52;
public class Main {
    public static void main(String[] args) {
        
        // Mengubah tipe data int ke String pada Array 
        // dikombinasikan dengan perulangan for-each
        
        int [] a = {1, 2, 3, 4, 5};
        
        String [] stringArray = new String[a.length];
        
        for (int i = 0; i < a.length; i++) {
            stringArray[i] = Integer.toString(a[i]);
        }
        
        System.out.print("Array asli: ");
        for (int element : a) {
            System.out.print(element + " ");
        }

        System.out.println("");

        System.out.print("Array setelah diubah menjadi String: ");
        for (String element : stringArray) {
            System.out.print(element+ " ");
        }
    }
}
