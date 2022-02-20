import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int move = sc.nextInt();
            
            String decrypt = "";
            
            for (int j = 0; j < s.length(); j ++) {
                int character = s.charAt(j) - move;
                
                if (character < 65) decrypt += (char) (character + 26);
                else decrypt += (char) character;
            }
            
            System.out.println(decrypt);
        }
        
        sc.close();
        
    }
}