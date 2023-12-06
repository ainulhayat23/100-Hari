package pkg_hari59;
public class Main {
    public static void main(String[] args) {
        
        // max min array multidimensi
       
        int [][] nilai = {{67,88,51},{95,13,10},{31,47,83}};
        int max = 0;
        int min = 1000;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++)  {
                if (max < nilai[i][j]) {
                    max = nilai[i][j];
                }
                if (min > nilai[i][j]) {
                    min = nilai[i][j];
                }
            }
        }
        System.out.println("terkecil : "+min);
        System.out.println("====================");
        System.out.println("terbesar : "+max);
    }
}
