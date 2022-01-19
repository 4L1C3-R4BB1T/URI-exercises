import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a > b) { int aux = a; a = b; b = aux; }

        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 2 || i % 5 == 3) System.out.println(i);
        }
        
        sc.close();
 
    }
}