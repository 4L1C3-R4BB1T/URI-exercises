import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            
            if (s.length() == 3) {
                if (s.indexOf("OB") != -1) {
                    s = "OBI";
                } else if (s.indexOf("UR") != -1) {
                    s = "URI";
                }
            }
            
            System.out.printf(i != n-1 ? "%s " : "%s\n", s);
        }
        
        sc.close();
        
    }
}