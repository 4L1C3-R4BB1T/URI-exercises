import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        
        if (name.length() > 80) System.out.println("NO");
        else System.out.println("YES");
        
        sc.close();
 
    }
}