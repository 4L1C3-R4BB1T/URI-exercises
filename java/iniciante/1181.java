import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        char op = sc.next().charAt(0);
        double mat[][] = new double[12][12], sum = 0;
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }
        
        for (int j = 0; j < 12; j++) {
           sum += mat[l][j];
        }
        
        if (op == 'M') sum /= 12;
        
        System.out.printf("%.1f\n", sum);
        
        sc.close();
 
    }
}