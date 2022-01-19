import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int s = 0, b = 0, a = 0;
        int s1 = 0, b1 = 0, a1 = 0;
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            
            s += sc.nextInt();
            b += sc.nextInt();
            a += sc.nextInt();
            
            s1 += sc.nextInt();
            b1 += sc.nextInt();
            a1 += sc.nextInt();
        }
        
        System.out.printf("Pontos de Saque: %.2f %%.\n", 100.0*s1/s);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", 100.0*b1/b);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", 100.0*a1/a);
        
        sc.close();
        
    }
}