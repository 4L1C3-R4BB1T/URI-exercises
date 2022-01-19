import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        
        System.out.printf(n.indexOf("13") != -1 ? "%s es de Mala Suerte\n" : "%s NO es de Mala Suerte\n", n);
        
        sc.close();
 
    }
}