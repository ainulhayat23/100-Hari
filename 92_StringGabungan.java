package pkg_hari92;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        
        String kalimat = "aku sangat mencintai si L";
        
        System.out.println(kalimat.charAt(24));
      
        String kata = kalimat.substring(3,20);
        System.out.println(kata);
        
        String kalimat2 = kata + " Liverpool";
        System.out.println(kalimat2);
    }
    
}
