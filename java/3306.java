import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        int vet[] = new int[n];
        
        for (int i = 0; i < n; i++) vet[i] = sc.nextInt();
        
        for (int j = 0; j < q; j++) {
            int op = sc.nextInt();
           
            int a = sc.nextInt()-1;
            int b = sc.nextInt();
            
            if (op == 1) {
                int v = sc.nextInt();
                for (int i = a; i < b; i++) vet[i] += v; 
            } else {
                int aux = vet[a];
                for (int i = a; i < b; i++) aux = mdc(aux, vet[i]);
                System.out.println(aux);    
            }
        }
        
        sc.close();
 
    }
    
    public static int mdc(int a, int b) {        
        while (b != 0) { int r = a % b; a = b; b = r; }
        return a;
    }
}