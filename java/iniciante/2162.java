import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int hInitial = sc.nextInt();
        
        boolean peak = false, valley = false, pattern = true;
        
        for (int i = 0; i < n-1; i++) {
            int h = sc.nextInt();
            
            if (h > hInitial) {
                if (peak) {
                    System.out.println(0);
                    pattern = false;
                    break;
                } else {
                    peak = true; 
                    valley = false;
                }
            } else if (h < hInitial) {
                if (valley) {
                    System.out.println(0);
                    pattern = false;
                    break;
                } else {
                    peak = false;
                    valley = true; 
                }
            } else {
                System.out.println(0);
                pattern = false;
                break; 
            }
            
            hInitial = h;
        }
        
        if (pattern) System.out.println(1);
        
        sc.close();
 
    }
}