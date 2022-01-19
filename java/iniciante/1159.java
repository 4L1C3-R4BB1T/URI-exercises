import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        while (x != 0) {
            int sum = 0, cont = 0;
            while (cont < 5) {
                if (x % 2 == 0) { sum += x; cont++; }
                x++;
            }
            System.out.println(sum);
            x = sc.nextInt();
        }
        
        sc.close();
 
    }
}