import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            
            if (num == 0) {
                System.out.println("NULL");
            } else if (num % 2 == 0) {
                if (num > 0) System.out.println("EVEN POSITIVE");
                else System.out.println("EVEN NEGATIVE");
            } else {
                if (num > 0) System.out.println("ODD POSITIVE");
                else System.out.println("ODD NEGATIVE");
            }
        }
        
        sc.close();
 
    }
}