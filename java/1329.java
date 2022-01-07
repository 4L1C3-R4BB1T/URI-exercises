import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            
            if (n == 0) break;
            
            int john = 0;
            int mary = 0;
            
            for (int i = 0; i < n; i++) {
                if (sc.nextInt() == 0) mary++;
                else john++;
            }
            
            System.out.printf("Mary won %d times and John won %d times\n", mary, john);
        }
        
        sc.close();
 
    }
}