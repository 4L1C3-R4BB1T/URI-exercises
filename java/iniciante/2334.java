import java.math.BigInteger;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        BigInteger p = sc.nextBigInteger();
        
        while (!p.equals(new BigInteger("-1"))) {
            if (p.equals(BigInteger.ZERO)) System.out.println(0);
            else System.out.println(p.subtract(BigInteger.ONE));
            
            p = sc.nextBigInteger();
        }
        
        sc.close();
 
    }
}