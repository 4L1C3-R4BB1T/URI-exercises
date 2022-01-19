import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        char op = sc.next().charAt(0);
        
        double matriz[][] = new double[12][12];
        double sum = 0;
       
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
                if (j > i) sum += matriz[i][j];
            }
        }
        
        if (op == 'M') sum /= 66;
        
        System.out.printf("%.1f\n", sum);
        
        sc.close();
 
    }
}