import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            
            int hash = 0;
            int element = 0;
            
            for (int j = 0; j < l; j++) {
                String s = sc.next();
                
                int position = 0;
                
                for (int k = 0; k < s.length(); k++) {
                    char c = s.charAt(k);
                    hash += ((c - 65) + element + position);
                    position++;
                }
                
                element++;
                position = 0;
            }
            
            element = 0;
           
            System.out.println(hash);
        }
        
        sc.close();
        
    }
}