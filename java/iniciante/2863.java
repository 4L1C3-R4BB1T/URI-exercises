import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
        
            float faster = 0;
            
            for (int i = 0; i < n; i++) {
                float t = sc.nextFloat();
                
                if (i == 0) faster = t;
                else if (t < faster) faster = t;
            }
            
            System.out.println(faster);
        }
        
        sc.close();
 
    }
}