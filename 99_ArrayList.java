package pkg_hari99;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> A = new ArrayList<String>();
        
        int i = 0;
        
        A.add("Liverpool");
        A.add("Real Madrid");
        A.add("SL Benfica");
        A.add("PSG");
        A.add("Juventus");
        
        for (String nama: A){
            i++;
            System.out.println(i+"."+nama);
        }
    }
}
