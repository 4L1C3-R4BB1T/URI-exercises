import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            
            int v = 0;
         
            for (int i = 0; i < n; i++) v += sc.nextInt();
           
            if (v >= n*2/3.0) System.out.println("impeachment");
            else System.out.println("acusacao arquivada");
        }
        
        sc.close();
 
    }
}