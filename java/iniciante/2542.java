import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();
            
            int marcos[][] = new int[m][n];
            int leonardo[][] = new int[l][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    marcos[i][j] = sc.nextInt();
                }
            }
            
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < n; j++) {
                    leonardo[i][j] = sc.nextInt();
                }
            }
            
            int cm = sc.nextInt()-1;
            int cl = sc.nextInt()-1;
            
            int a = sc.nextInt()-1;
            
            if (marcos[cm][a] > leonardo[cl][a]) {
                System.out.println("Marcos");
            } else if (marcos[cm][a] < leonardo[cl][a]) {
                System.out.println("Leonardo");
            } else {
                System.out.println("Empate");
            } 
        }
        
        sc.close();
        
    }
}