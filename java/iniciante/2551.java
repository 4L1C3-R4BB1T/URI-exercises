import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            double record = 0;
            
            for (int i = 1; i <= n; i++) {
                double t = sc.nextDouble();
                double d = sc.nextDouble();
                if (d/t > record) {
                    record = d/t;
                    System.out.println(i);
                }
            }
        }
        
        sc.close();
 
    }
}