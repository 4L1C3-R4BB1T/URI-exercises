import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int i = sc.nextInt();
        
        System.out.println("Feliz nat" + "a".repeat(i) + "l!");
        
        sc.close();
        
    }
}