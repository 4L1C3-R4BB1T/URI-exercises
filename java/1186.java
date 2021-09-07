import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        char o = sc.next().charAt(0);
        double m[][] = new double[12][12], sum = 0;
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = sc.nextDouble();
                if (j > 11-i) sum += m[i][j];
            }
        }
        
        if (o == 'M') sum /= 66;
        System.out.printf("%.1f\n", sum);
        
        sc.close();
 
    }
}