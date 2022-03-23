import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String s = sc.next();
            
            String formatted = "";
            
            for (int i = 0; i < s.length(); i++) {
                formatted += " ".repeat(i) 
                    + s.substring(0, s.length() - i)
                        .replaceAll ("(.)", "$1 ")
                        .trim() 
                    + "\n";
            }
            
            System.out.println(formatted);
        }
        
        sc.close();
        
    }
}