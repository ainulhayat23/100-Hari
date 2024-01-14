package pkg_hari98;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        TreeSet<String> A = new TreeSet<String>();
        
        A.add("Nunez"); A.add("Gakpo"); A.add("Diaz");
        
        Iterator<String> iterator = A.iterator();
        
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
