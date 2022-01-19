import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            
            int aux = n % 100;
            n /= 100;
            
            System.out.println(aux > 0 ? ++n : n);
        }
        
        sc.close();
 
    }
}