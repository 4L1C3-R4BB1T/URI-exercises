import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        String strA = sc.next();
        String strB = sc.next();
        
        if (strA.compareTo(strB) > 0) {
            System.out.println(strB + "\n" + strA);
        } else {
            System.out.println(strA + "\n" + strB);
        }
        
        sc.close();
 
    }
}