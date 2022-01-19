import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            
            int a = s.charAt(0) - 48;
            int b = s.charAt(2) - 48;
            int c = (int) s.charAt(1);
            
            int result = 0;
            
            if (a == b) result = a * b;
            else if (c >= 65 && c <= 90) result = b - a;
            else result = a + b;
            
            System.out.println(result);
        }
        
        sc.close();
 
    }
}