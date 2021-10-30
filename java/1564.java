import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            if (sc.nextInt() > 0) System.out.println("vai ter duas!");
            else System.out.println("vai ter copa!");
        }
        
        sc.close();
 
    }
}