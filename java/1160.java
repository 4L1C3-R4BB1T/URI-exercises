import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int pA = sc.nextInt();
            int pB = sc.nextInt();
            double g1 = sc.nextDouble()/100;
            double g2 = sc.nextDouble()/100;
            int years = 0;
            
            while (pA <= pB) {
                pA *= (g1 + 1);
                pB *= (g2 + 1);
                years++;
                if (years > 100) break;
            }
            
            if (years > 100) System.out.println("Mais de 1 seculo.");
            else System.out.println(years + " anos.");
        }
        
        sc.close();
 
    }
}