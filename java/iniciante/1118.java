import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int x;
        
        do {
            int cont = 0;
            double sum = 0;
            
            x = 0;
            
            while (cont != 2) {
                double n = sc.nextDouble();
                
                if (n < 0 || n > 10) System.out.println("nota invalida");
                else { cont++; sum += n; }
            }
            
            System.out.printf("media = %.2f\n", sum/cont);
            
            while (x < 1 || x > 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                x = sc.nextInt();
            }
        } while (x != 2);
        
        sc.close();
 
    }
}