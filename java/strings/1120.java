import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        String d = "";
        String n = "";
        
        while (!(d = sc.next()).equals("0") && !(n = sc.next()).equals("0")) {
            n = n.replace(d, "").replaceFirst("0*", "");
            System.out.println(n.length() > 0 ? n : "0");
        }
        
        sc.close();
        
    }
}