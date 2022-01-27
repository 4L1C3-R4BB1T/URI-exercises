import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            if (n == 0 && m == 0) break;

            String[] img = new String[n];
            
            for (int i = 0; i < n; i++) {
                img[i] = sc.next();
            }
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            String resizedImg = "";
            
            for (int i = 0; i < n; i++) {
                String line = "";
                for (int j = 0; j < m; j++) {
                    line += Character.toString(img[i].charAt(j)).repeat(b/m);
                }
                line += "\n";
                resizedImg += line.repeat(a/n);
            }
            
            System.out.println(resizedImg);
        }
        
        sc.close();
        
    }
}