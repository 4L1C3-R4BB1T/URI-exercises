import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            
            if (n == 0) break;
            
            String player1 = sc.next();
            String player2 = sc.next();
            
            System.out.println("Teste " + i);
            
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                if ((a + b) % 2 == 0) System.out.println(player1);
                else System.out.println(player2);
            }
            
            System.out.println();
            
            i++;
        }
        
        sc.close();
 
    }
}