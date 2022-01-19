import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String s = sc.next();
            int n = sc.nextInt();
            
            String word = "";
            
            for (int i = 0; i < n; i++) {
                int l = sc.nextInt()-1;
                word += s.charAt(l);
            }
            
            System.out.println(word);
        }
        
        sc.close();
        
    }
}