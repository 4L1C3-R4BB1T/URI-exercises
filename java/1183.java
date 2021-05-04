import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        char op = sc.next().charAt(0);
        
        float matriz[][] = new float[12][12];
        
        int flag = 1, cont = 0; 
        double sum = 0;
        
        if (op == 'S') cont = 1; 
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextFloat();
                
                if (j >= flag) {
                    sum += matriz[i][j];
                    if (op == 'M') cont++;
                }
            }
            flag++;
        }
        
        System.out.printf("%.1f\n", (sum/cont));
        
        sc.close();
 
    }
}