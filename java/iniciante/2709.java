import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int m = sc.nextInt();
            
            int coins[] = new int[m+1];
            for (int i = 1; i <= m; i++) coins[i] = sc.nextInt();
            
            int n = sc.nextInt(), sum = 0;
            
            for (int j = 0; j*n < m; j++) sum += coins[m-j*n];
            
            boolean prime = true;
            for (int k = 2; k <= Math.sqrt(sum); k++) {
                if (sum % k == 0) { prime = false; break; }
            }
            
            System.out.println((prime && sum > 1) ? "You’re a coastal aircraft, Robbie, a large silver aircraft." : "Bad boy! I’ll hit you.");
        }
        
        sc.close();
 
    }
}