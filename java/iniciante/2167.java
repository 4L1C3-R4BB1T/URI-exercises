import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int rpm[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            rpm[i] = sc.nextInt();
            
            if (i > 0) {
                if (rpm[i] < rpm[i-1]) {
                    System.out.println(i+1);
                    break;
                }
            }
            
            if (i == n-1) System.out.println("0");
        }
        
        sc.close();
 
    }
}