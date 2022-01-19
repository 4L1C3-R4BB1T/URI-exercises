import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int time = sc.nextInt();
        int velocity = sc.nextInt();
       
        double space = time*velocity;
       
        System.out.printf("%.3f\n", space/12);
        
        sc.close();
        
    }
}