import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        String names[] = new String[10];
        
        for (int i = 0; i < names.length; i++) names[i] = sc.next();
        
        System.out.printf("%s\n%s\n%s\n", names[2], names[6], names[8]);
        
        sc.close();
 
    }
}