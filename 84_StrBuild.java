package pkg_hari84;
public class Main {
    public static void main(String[] args) {
        
       StringBuilder sb = new StringBuilder("Halo");
        System.out.println(sb);

        // append        
        sb.append(" Nama Saya Nunez");
        System.out.println(sb);

        // insert
        sb.insert(14, " Darwin");
        System.out.println(sb);

        // delete
        sb.delete(20, 26);
        System.out.println(sb);

        // setCharAt
        sb.setCharAt(15, 'S');
        System.out.println(sb);

        // replace
        sb.replace(15, 20, "Gakpo");
        System.out.println(sb);

        // casting to String
        String kalimat = sb.toString();
        System.out.println(kalimat);
    
    }
}
