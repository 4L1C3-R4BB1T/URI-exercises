import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(), g = 0, v = 0;
        
        for (int i = 0; i < n; i++) {
            if (sc.next().equals("G")) g += sc.nextInt();
            else v += sc.nextInt();
        }
        
        System.out.println((v >= g) ? "A greve vai parar." 
            : "NAO VAI TER CORTE, VAI TER LUTA!");
        
        sc.close();
 
    }
}