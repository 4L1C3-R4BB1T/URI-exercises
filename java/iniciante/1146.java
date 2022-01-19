import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        while (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i == n) System.out.print(i + "\n");
                else System.out.print(i + " ");
            }
            
            n = sc.nextInt();
        }
        
        sc.close();
 
    }
}