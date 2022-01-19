import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            long fatM = 1, fatN = 1;
            
            for (int i = 2; i <= m; i++) fatM *= i;
            for (int j = 2; j <= n; j++) fatN *= j;
           
            System.out.println(fatM + fatN);
        }

        sc.close();
 
    }
}