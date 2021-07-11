import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int m = sc.nextInt();
           
            for (int i = 0; i < m; i++) {
                int xp = sc.nextInt();
                int yp = sc.nextInt();
                System.out.println(((xp <= x && yp <= y) || (xp <= y && yp <= x)) ? "Sim" : "Nao");
            }
        }
        
        sc.close();
 
    }
}