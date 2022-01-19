import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        while (m > 0 && n > 0) {
            if (m > n) { int aux = m; m = n; n = aux; }

            int sum = 0;
            
            for (int i = m; i <= n; i++) { 
                sum += i; 
                System.out.printf(i + " ");
            }
            
            System.out.println("Sum=" + sum);
            
            m = sc.nextInt();
            n = sc.nextInt();
        }
        
        sc.close();
 
    }
}