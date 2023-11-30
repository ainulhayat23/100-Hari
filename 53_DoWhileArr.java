package pkg_Hari53;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan banyak array : ");
        int banyak = input.nextInt();
        int[] index = new int[banyak];

        int i = 0;
        do {
            System.out.print("Masukkan index "+i+" : ");
            index[i] = input.nextInt();
            i++;
            
        } while (i < banyak);
        System.out.print("Index di array : ");
        for (int j = 0; j < banyak; j++) {
            System.out.print(index[j] + " ");
        }
    }
}
