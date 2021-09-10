import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            boolean flag = false;
            int index = 0;
            
            String date[] = new String[d];
            
            for (int i = 0; i < d; i++) {
                date[i] = sc.next();
            
                boolean aux = true;
                
                for (int j = 0; j < n; j++) {
                    if (sc.nextInt() == 0) aux = false;
                }
                
                if (aux) { 
                    if (!flag) { index = i; flag = true; }
                }
            }
            
            System.out.println(flag ? date[index] : "Pizza antes de FdI");
        }
        
        sc.close();
 
    }
}