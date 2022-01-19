import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int pos = 0;
        double sum = 0;
        
        for (int i = 0; i < 6; i++) {
            double n = sc.nextDouble();
            if (n > 0) { pos++; sum += n; }
        }
        
        System.out.printf("%d valores positivos\n%.1f\n", pos, sum/pos);
        
        sc.close();
 
    }
}