import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        
        for (int i = 0; i < c; i++) {
            double t = sc.next().length() * 0.01;
            System.out.printf("%.2f\n", t);
        }
        
        sc.close();
 
    }
}