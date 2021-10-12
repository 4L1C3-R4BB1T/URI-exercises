import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int l = sc.nextInt();
            
            int max = 0 , vel = 0;
            
            for (int i = 0; i < l; i++) {
                int v = sc.nextInt();
                if (v > max) max = v;
            }
            
            if (max < 10) vel = 1;
            else if (max < 20) vel = 2;
            else vel = 3;
            
            System.out.printf("%d\n", vel);
        }
        
        sc.close();
 
    }
}