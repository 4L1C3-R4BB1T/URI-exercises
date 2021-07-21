import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        long fib[] = new long[61]; 
        fib[0] = 0; fib[1] = 1;
        
        for (int j = 2; j < fib.length; j ++) {
            fib[j] = fib[j-2] + fib[j-1];
        }
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.printf("Fib(%d) = %d\n", n, fib[n]);
        }
        
        sc.close();
 
    }
}