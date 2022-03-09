import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            
            int end = s.length();
            int half = end/2;
            
            String s1 = new StringBuilder(s.substring(0, half))
                .reverse().toString();
            
            String s2 = new StringBuilder(s.substring(half, end))
                .reverse().toString();
            
            System.out.println(s1 + s2);
        }
        
        sc.close();
        
    }
}