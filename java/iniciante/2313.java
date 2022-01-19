import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int aux = 0;
        if (b > a) { aux = a; a = b; b = aux; }
        if (c > a) { aux = a; a = c; c = aux; }
        
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.printf("Valido-");
           
            if (a == b && a == c) System.out.printf("Equilatero\n");
            else if (a == b || a == c || b == c) System.out.printf("Isoceles\n");
            else System.out.printf("Escaleno\n");
            
            if (a*a == b*b + c*c) System.out.printf("Retangulo: S\n"); 
            else System.out.printf("Retangulo: N\n");
        } else {
            System.out.printf("Invalido\n");
        }
        
        sc.close();
 
    }
}