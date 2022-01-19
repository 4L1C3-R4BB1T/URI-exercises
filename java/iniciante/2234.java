import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        double h = sc.nextDouble();
        double p = sc.nextDouble();
        
        System.out.printf("%.2f\n", (h/p));
        
        sc.close();
 
    }
}