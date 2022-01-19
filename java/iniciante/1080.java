import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int max = 0, index = 0;
        
        for (int i = 1; i <= 100; i++) {
            int n = sc.nextInt();
            if (n > max) { max = n; index = i; };
        }
        
        System.out.printf("%d\n%d\n", max, index);
        
        sc.close();
 
    }
}