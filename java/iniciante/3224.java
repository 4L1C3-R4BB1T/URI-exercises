import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        String jon = sc.next();
        String doctor = sc.next();
        
        if (jon.length() < doctor.length()) System.out.printf("no\n");
        else System.out.printf("go\n");
        
        sc.close();
 
    }
}