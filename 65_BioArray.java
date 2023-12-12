package pkg_hari65;
public class Main {
    public static void main(String[] args) {
        
        String biodata [][] = {
        {"Nama  : ","AINUL HAYAT"},
        {"Kelas : ","INFORMATIKA B23"},
        {"NIM   : ","D0223317"},
        {"===== ","TERIMAKASIH ======"}
        };
        for (int i=0; i<biodata.length; i++){
            for (int j=0; j<biodata[i].length; j++){
               System.out.print(biodata[i][j]); 
            }
          System.out.println(""); 
        }
    }
}
