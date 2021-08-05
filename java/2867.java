import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        
        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int dig = (int) (Math.log10(Math.pow(n, m)) + 1);
            System.out.printf("%d\n", dig);
        }
        
        sc.close();
 
    }
}