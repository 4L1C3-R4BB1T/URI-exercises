import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((a < b + c) && (a > Math.abs(b - c))) {
            System.out.println("Perimetro = " + (a + b + c));
        } else {
            System.out.println("Area = " + (((a + b)*c)/2));
        }
        
        sc.close();
 
    }
}