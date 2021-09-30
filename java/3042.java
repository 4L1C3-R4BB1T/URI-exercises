import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        
        while (m != 0) {
            int aux = 2, cont = 0;
            
            for (int i = 0; i < m; i++) {
                int l = sc.nextInt();
                int c = sc.nextInt();
                int r = sc.nextInt();
               
                switch (aux) {
                    case 1:
                        if (l == 1) {
                            if (r == 1) { aux = 2; cont++; } 
                            else { aux = 3; cont += 2; }
                        }
                        break;
                    case 2:
                        if (c == 1) {
                            if (l == 1) aux = 3;
                            else aux = 1;
                            cont++;
                        }
                        break;
                    case 3:
                        if (r == 1) {
                            if (l == 1) { aux = 2; cont++; }
                            else { aux = 1; cont += 2; }
                        }
                }
            }
            
            System.out.println(cont);
            
            m = sc.nextInt();
        }
        
        sc.close();
 
    }
}