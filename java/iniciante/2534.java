import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int grades[] = new int[n];
            
            for (int i = 0; i < n; i++) {
                grades[i] = sc.nextInt();
            }
            
            Arrays.sort(grades);
            
            for (int j = 0; j < q; j++) {
                int p = grades.length - sc.nextInt();
                System.out.println(grades[p]);
            }
        }
        
        sc.close();
        
    }
}