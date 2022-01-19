import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double aux = 0;
        
        if (b > a) { aux = a; a = b; b = aux; }
        if (c > b) { aux = b; b = c; c = aux; }
        if (b > a) { aux = a; a = b; b = aux; }
        
        if (a < b + c) {
            if (a*a == b*b + c*c) System.out.println("TRIANGULO RETANGULO"); 
            else if (a*a > b*b + c*c) System.out.println("TRIANGULO OBTUSANGULO"); 
            else System.out.println("TRIANGULO ACUTANGULO"); 
            
            if (a == b && b == c) System.out.println("TRIANGULO EQUILATERO"); 
            else if (a == b || b == c) System.out.println("TRIANGULO ISOSCELES"); 
        } else System.out.println("NAO FORMA TRIANGULO");
    
        sc.close();
        
    }
}