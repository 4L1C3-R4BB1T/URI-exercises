import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        double n = sc.nextDouble();
        double l = sc.nextDouble();
        
        System.out.printf("%.0f\n", n*l);
         
        sc.close();
 
    }
}