package pkg_hari80;
public class Main {
    public static void main(String[] args) {
        
        String inputString = "Hello,World,Java";
        
        String [] hasilSplit = inputString.split(",");
        
        for (String token : hasilSplit) {
            System.out.println(token);
        }
    }
}
