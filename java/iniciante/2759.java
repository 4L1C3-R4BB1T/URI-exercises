import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char c = sc.next().charAt(0);
        
        System.out.printf("A = %s, B = %s, C = %s\n", a, b, c);
        System.out.printf("A = %s, B = %s, C = %s\n", b, c, a);
        System.out.printf("A = %s, B = %s, C = %s\n", c, a, b);

        sc.close();
 
    }
}