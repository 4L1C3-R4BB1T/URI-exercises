import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            
            boolean space = true;
            
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                
                if (c == 32) {
                    space = true;
                } else if (space) {
                    space = false;
                    System.out.print(c);
                }
            }
            
            System.out.println();
        }
        
        sc.close();
        
    }
}