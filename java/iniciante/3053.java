import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);    
 
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            
            if (m == 1) {
                if (c == 'A') c = 'B';
                else if (c == 'B') c = 'A';
            } else if (m == 2) {
                if (c == 'B') c = 'C';
                else if (c == 'C') c = 'B';
            } else {
                if (c == 'C') c = 'A';
                else if (c == 'A') c = 'C';
            }
        }
        
        System.out.println(c);
        
        sc.close();

    }
}