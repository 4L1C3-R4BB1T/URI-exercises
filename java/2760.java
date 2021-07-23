import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine(), b = sc.nextLine(), c = sc.nextLine();
        
        System.out.printf("%s%s%s\n%s%s%s\n%s%s%s\n", a, b, c, b, c, a, c, a, b);
        
        if (a.length() > 10) a = a.substring(0, 10);
        if (b.length() > 10) b = b.substring(0, 10);
        if (c.length() > 10) c = c.substring(0, 10);
        
        System.out.printf("%s%s%s\n", a, b, c);
        
        sc.close();
 
    }
}