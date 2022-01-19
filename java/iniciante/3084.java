import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int h = sc.nextInt()/30;
            int m = sc.nextInt()/6;
            System.out.printf("%02d:%02d\n", h, m);
        }
        
        sc.close();
 
    }
}