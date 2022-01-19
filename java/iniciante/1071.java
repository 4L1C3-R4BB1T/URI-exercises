import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if (x > y) { int aux = x; x = y; y = aux; }
        
        int sum = 0;
        
        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) sum += i; 
        }
        
        System.out.println(sum);
        
        sc.close();
 
    }
}