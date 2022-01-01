import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            
            if (h1 + h2 + m1 + m2 == 0) break;
            
            int min = 0;
            
            if (h2 < h1 || h2 == h1 && m2 < m1) h2 += 24;
            else if (h1 == h2 && m1 == m2) min = 1440;
            
            min += (h2 - h1) * 60 + m2 - m1;
            
            System.out.println(min);
        }
        
        sc.close();
 
    }
}