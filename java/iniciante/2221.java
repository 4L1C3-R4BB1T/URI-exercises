import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int instance = sc.nextInt();
        
        for (int i = 0; i < instance; i++) {
            int bonus = sc.nextInt();
            
            int values[] = new int[6];
            for (int j = 0; j < 6; j++) values[j] = sc.nextInt(); 
        
            double hitD = (values[0] + values[1])/2.0;
            if (values[2] % 2 == 0) hitD += bonus;
            
            double hitG = (values[3] + values[4])/2.0;
            if (values[5] % 2 == 0) hitG += bonus;
            
            if (hitD > hitG) System.out.println("Dabriel");
            else if (hitD < hitG) System.out.println("Guarte");
            else System.out.println("Empate");
        }
        
        sc.close();
 
    }
}