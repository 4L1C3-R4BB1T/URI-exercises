import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int q = a / b;
        int r = a % b;
        
        if (r < 0) {
            r += Math.abs(b);
            q = (a - r) / b;
        }
        
        System.out.println(q + " " + r);
        
        sc.close();
 
    }
}