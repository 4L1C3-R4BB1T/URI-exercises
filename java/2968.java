import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int v = sc.nextInt();
        int n = sc.nextInt();
        
        int placas = v*n;
        
        for (int i = 1; i <= 9; i++) {
            System.out.printf(i == 9 ? "%.0f\n" : "%.0f ", Math.ceil(placas*(i/10.0)));
        }
        
        sc.close();
 
    }
}