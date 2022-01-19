import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int v = 0;
        
        for (int i = 0; i < n; i ++) {
            String seq = sc.next();
            if (seq.indexOf("CD") == -1) v++;
        }
        
        System.out.println(v);
        
        sc.close();
 
    }
}