import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int x = 1;
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            
            int q = 1;
            for (int i = 1; i <= n; i++) q += i;
            
            StringBuilder s = new StringBuilder();
            
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    s.append(" " + i);
                }
            }
            
            System.out.printf("Caso %d: %d numero" + (q == 1 ? "" : "s") + "\n0%s\n\n", x, q, s);
            
            x++;
        }
        
        sc.close();
 
    }
}