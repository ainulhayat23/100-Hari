package pkg_hari70;
public class Main {
    public static void main(String[] args) {
        
        
        double x [] = {40.7 , 2.4, 1.0, 5.3, 10.2, 12.9, 3.6};
        double maks = 0;
        for(int i = 0; i < x.length; i++){
            maks = Math.max(maks, x[i]);
        }
        System.out.println(" "+maks);
   }
}
