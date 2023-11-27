package pkg_Hari50;
public class Main {
    public static void main(String[] args) {
        
        // Length pada Array Multidimensi
        
        String [][] kontak = {
            {"Thiago","\t*123#"," - Bonus"},
            {"Diaz","\t*363#", " - Call center"},
            {"Matip","\t*888#", " - Cek pulsa"},
            {"Elliot","\t*555#", " - Diskon", " - Promo"}
        };
        
        for(int i = 0; i < kontak.length; i++){
            for(int j = 0; j < kontak[i].length; j++){
                System.out.print(kontak [i][j]);
            }
            System.out.println("");
        }
    }
}
