import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        while (n != 0) {
            sc.nextLine();
            
            String[] words = new String[n];
            
            int maxLength = 0;
            
            for (int i = 0; i < n; i++) {
                words[i] = sc.nextLine();
                int length = words[i].length();
                if (length > maxLength) maxLength = length;
            }
            
            for (String s : words) {
                int spaces = maxLength - s.length();
                System.out.println(spaces > 0 ? " ".repeat(spaces) + s : s);
            }
            
            if ((n = sc.nextInt()) != 0) System.out.println();
        }
        
        sc.close();
        
    }
}