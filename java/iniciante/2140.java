import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int notas[] = {2, 5, 10, 20, 50, 100};
        
        while (m != 0 && n != 0) {
            int troco = m - n;
            boolean aux = false;
            
            loop:
            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas.length; j++) {
                    if (notas[i] + notas[j] == troco) { aux = true; break loop; }
                }
            }
            
            System.out.println(aux ? "possible" : "impossible");
            
            n = sc.nextInt();
            m = sc.nextInt();
        }
        
        sc.close();
 
    }
}