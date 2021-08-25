import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        float m[][] = new float[12][12], sum = 0;
        
        int c = sc.nextInt();
        char t = sc.next().charAt(0);
    
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = sc.nextFloat();
                if (j == c) sum += m[i][j];
            }
        }
        
        if (t == 'M') sum /= 12;
        
        System.out.printf("%.1f\n", sum);
        
        sc.close();
 
    }
}