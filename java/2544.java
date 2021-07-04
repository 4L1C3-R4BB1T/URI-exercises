import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            double vezes = Math.log(n)/Math.log(2);
            System.out.printf("%.0f\n", vezes);
        }
        
        sc.close();
 
    }
}