import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextDouble();
        double n[] = new double[100];
        
        for (int i = 0; i < 100; i++) {
            if (i != 0) n[i] = n[i-1]/2;
            else n[i] = x;
            
            System.out.printf("N[%d] = %.4f\n", i, n[i]);
        }
        
        sc.close();
        
    }
}