import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        double r = sc.nextDouble();

        double v = (4.0/3)*3.14159*r*r*r;
        
        System.out.println("VOLUME = " + String.format("%.3f", v));
        
        sc.close();
 
    }
}