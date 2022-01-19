import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int f[] = new int[n]; 
        f[0] = 0; 
        f[1] = 1;
        
        for (int i = 2; i < n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        
        for (int i = 0; i < f.length; i++) {
            if (i == n-1) System.out.printf("%d\n", f[i]);
            else System.out.printf("%d ", f[i]);
        }
    
        sc.close();
 
    }
}