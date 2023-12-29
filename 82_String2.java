package pkg_hari82;
public class Main {
    public static void main(String[] args) {
        
        // substring
        String str = "Manusia Biasa";
        System.out.println("Hewan " + str.substring(8));
        System.out.println(str.substring(0, 7) + " B Aja");

        // replace
        String name = "Ainul Hayat";
        String ganti = name.replace("Hayat", "Nolan");
        System.out.println(ganti);

        // compare
        String nama1 = "Hayat";
        String nama2 = "T-rex";
        System.out.println(nama1.compareTo(nama2));
        System.out.println(nama2.compareTo(nama1));

    }

}
