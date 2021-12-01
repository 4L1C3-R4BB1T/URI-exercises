import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int p = sc.nextInt();
        int n = sc.nextInt();
        
        boolean win = true;
        int currentPipe = sc.nextInt();
        
        for (int i = 1; i < n; i++) {
            int nextPipe = sc.nextInt();
            
            if (Math.abs(nextPipe - currentPipe) > p) {
                win = false;
                break;
            }
            
            currentPipe = nextPipe;
        }
        
        System.out.println(win ? "YOU WIN" : "GAME OVER");
        
        sc.close();
        
    }
}