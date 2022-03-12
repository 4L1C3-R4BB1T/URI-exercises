import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            StringBuilder s = new StringBuilder(sc.nextLine());
            
            int length = s.length();
            
            for (int j = 0; j < length; j++) {
                char c = s.charAt(j);
              
                if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                    c = (char) (c + 3);
                    s.setCharAt(j, c);
                } 
            }
            
            s.reverse();
            
            for (int k = length / 2; k < length; k++) {
                char c = (char) (s.charAt(k) - 1);
                s.setCharAt(k, c);
            }
            
            System.out.println(s);
        }
        
        sc.close();
       
    }
}