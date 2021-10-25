import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int a = 0, b = 0;
        
        if (n % 2 == 0) { a = (n*n)/2; b = a; } 
        else { a = (n*n)/2 + 1; b = a-1; }
        
        System.out.printf("%d casas brancas e %d casas pretas\n", a, b);
        
        sc.close();
 
    }
}