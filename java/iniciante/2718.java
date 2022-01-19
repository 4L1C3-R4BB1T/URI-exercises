import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            String b = Long.toBinaryString(x);

            int lamp = 0, max = 0;
            for (int j = 0; j < b.length(); j++) {
                char c = b.charAt(j);
                if (c == '1') { lamp++; if (lamp > max) max = lamp; } 
                else lamp = 0;
            }
            
            System.out.println(max);
        }
        
        sc.close();
 
    }
}