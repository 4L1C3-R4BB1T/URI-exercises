import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int c = 0, r = 0, s = 0, tot = 0;
        
        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            char t = sc.next().charAt(0);
            
            if (t == 'C') c += q;
            else if (t == 'R') r += q;
            else s += q;
        
            tot += q;
        }
        
        System.out.printf("Total: %d cobaias\nTotal de coelhos: %d\n", tot, c);
        System.out.printf("Total de ratos: %d\nTotal de sapos: %d\n", r, s);
        System.out.printf("Percentual de coelhos: %.2f %%\n", ((double) c/tot)*100);
        System.out.printf("Percentual de ratos: %.2f %%\n", ((double) r/tot)*100);
        System.out.printf("Percentual de sapos: %.2f %%\n", ((double) s/tot)*100);

        sc.close();
 
    }
}