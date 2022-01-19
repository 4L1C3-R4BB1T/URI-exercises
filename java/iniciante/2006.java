import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc =  new Scanner(System.in);
        
        int t = sc.nextInt(), aux = 0;
        
        for (int i = 0; i < 5; i++) {
            if (sc.nextInt() == t) aux++;
        }
        
        System.out.println(aux);
        
        sc.close();
 
    }
}