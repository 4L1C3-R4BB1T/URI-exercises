import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int n = 1;
        
        while (n <= y) {
            for (int i = 0; i < x; i++) {
                if (i == x-1) System.out.printf("%d\n", n);
                else System.out.printf("%d ", n);
                n++;
            }
        }
        
        sc.close();
 
    }
}