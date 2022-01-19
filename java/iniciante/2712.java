import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            
            if (!s.matches("[A-Z]{3}-[0-9]{4}")) {
                System.out.println("FAILURE");
            } else {
                char d = s.charAt(s.length() - 1);
         
                if (d == '1' || d == '2') System.out.println("MONDAY");
                else if (d == '3' || d == '4') System.out.println("TUESDAY");
                else if (d == '5' || d == '6') System.out.println("WEDNESDAY");
                else if (d == '7' || d == '8') System.out.println("THURSDAY");
                else System.out.println("FRIDAY");   
            }
        }
        
        sc.close();
 
    }
}