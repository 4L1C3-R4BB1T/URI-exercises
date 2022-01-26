import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();
            
            if (a.indexOf(b, a.length() - b.length()) == -1) {
                System.out.println("nao encaixa");
            } else {
                System.out.println("encaixa");
            }
        }
        
        sc.close();
 
    }
}