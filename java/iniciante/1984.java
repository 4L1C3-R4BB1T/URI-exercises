import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        String s = String.valueOf(n), inverted = "";
		
        for (int i = s.length()-1; i >= 0; i--) {
            inverted += s.charAt(i);
        }
        
        System.out.println(inverted);
        
        sc.close();
 
    }
}