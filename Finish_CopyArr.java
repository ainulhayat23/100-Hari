package pkg_Finish;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        
        int[] arrayAngka1 = {67, 89, 53, 44, 05, 16, 37, 98, 29};
  
        System.out.println("\nmengkopi dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 5, 8);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);
       
    }
    private static void printArray(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
    }
}
