import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int count = 1;
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            
            if (n == 0) break;
            
            System.out.printf("Teste %d\n%.0f\n\n", count++, Math.pow(2, n) - 1);
        }
        
        sc.close();
 
    }
}