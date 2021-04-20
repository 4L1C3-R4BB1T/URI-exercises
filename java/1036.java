import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double delta = b*b - 4*a*c;
        
        if (a != 0 && delta >= 0) {
            double r1 = (-b + Math.sqrt(delta))/(2*a);
            double r2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("R1 = " + String.format("%.5f", r1) + "\nR2 = " + String.format("%.5f", r2));
        } else {
            System.out.println("Impossivel calcular");
        }
        
        sc.close();
 
    }
}