import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), car = 0, doll = 0;
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            if (sc.next().equals("F")) doll++;
            else car++;
        }

        System.out.printf("%d carrinhos\n%d bonecas\n", car, doll);
        
        sc.close();
 
    }
}