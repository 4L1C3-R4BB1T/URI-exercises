import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        if (x == 0) {
            if (y == 0) System.out.println("Origem");
            else System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0) {
            if (y > 0) System.out.println("Q1");
            else System.out.println("Q4");
        } else {
            if (y > 0) System.out.println("Q2");
            else System.out.println("Q3");
        }
        
        sc.close();
        
    }
}