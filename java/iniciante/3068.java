import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int t = 1;
        
        while (true) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            if (x1 + y1 + x2 + y2 == 0) break;
            
            int n = sc.nextInt(), m = 0;
        
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                if (x >= x1 && x <= x2 && y <= y1 && y >= y2) m++;
            }
            
            System.out.printf("Teste %d\n%d\n", t++, m);
        }
        
        sc.close();
 
    }
}