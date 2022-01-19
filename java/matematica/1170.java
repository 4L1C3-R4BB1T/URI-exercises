import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            double c = sc.nextDouble();

            int days = 0;

            while (c > 1) { 
                c /= 2; 
                days++; 
            }
            
            System.out.println(days + " dias");
        }
        
        sc.close();
 
    }
}