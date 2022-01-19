import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int aux = sc.nextInt(), index = 1; 
    
        for (int i = 2; i <= n; i++) {
            int t = sc.nextInt();
            if (t < aux) { aux = t; index = i; }
        }
        
        System.out.println(index);
        
        sc.close();
 
    }
}