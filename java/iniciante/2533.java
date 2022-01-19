import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int m = sc.nextInt();
            double a = 0, b = 0;
        
            for (int i = 0; i < m; i++) {
                int n = sc.nextInt();
                int c = sc.nextInt();
                
                a += n*c;
                b += c;
            }
            
            System.out.printf("%.4f\n", a/(b*100));
        }
        
        sc.close();
 
    }
}