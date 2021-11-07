import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t != 0) {
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                
                if (n % 2 == 0) {
                    System.out.println(2*n - 2);
                } else {
                    System.out.println(2*n - 1);
                }
            }
            
            t = sc.nextInt();
        }
        
        sc.close();
        
    }
}