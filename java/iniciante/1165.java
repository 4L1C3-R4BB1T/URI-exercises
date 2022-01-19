import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            
            boolean aux = true;
            
            for (int j = 2; j < x; j++) {
                if (x % j == 0) { aux = false; break; }    
            }
            
            System.out.printf(aux ? "%d eh primo\n" : "%d nao eh primo\n", x);
        }
        
        sc.close();
 
    }
}