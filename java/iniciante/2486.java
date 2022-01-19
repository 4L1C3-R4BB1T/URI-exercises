import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t != 0) {
            int x = 0;
            
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                String a = sc.nextLine().trim();
                
                switch (a) {
                    case "suco de laranja": x += 120*n; break;
                    case "morango fresco": 
                    case "mamao": x += 85*n; break;
                    case "goiaba vermelha": x += 70*n; break;
                    case "manga": x += 56*n; break;
                    case "laranja": x += 50*n; break;
                    case "brocolis": x += 34*n;
                }
            }
            
            if (x > 130) System.out.printf("Menos %d mg\n", x-130);
            else if (x < 110) System.out.printf("Mais %d mg\n", 110-x);
            else System.out.printf("%d mg\n", x);
            
            t = sc.nextInt();
        }
        
        sc.close();
 
    }
}