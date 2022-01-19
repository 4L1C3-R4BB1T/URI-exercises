import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int c = sc.nextInt();
        
        boolean aux = true;
        
        for (int i = 1; i < n; i++) {
            int v = sc.nextInt();
            if (v > c) { aux = false; break; }
        }
        
        System.out.println(aux ? "S" : "N");
        
        sc.close();
 
    }
}