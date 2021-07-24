import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long sheeps[] = new long[n], sum = 0; 
        int attacked[] = new int[n], j = 0, atk = 0;
        
        for (int i = 0; i < n; i++) sheeps[i] = sc.nextInt();
        
        while (j >= 0 && j < n) {
            if (sheeps[j] % 2 == 0) {
                if (sheeps[j] > 0) { sheeps[j]--; attacked[j] = 1; }
                j--;
            } else {
                if (sheeps[j] > 0) { sheeps[j]--; attacked[j] = 1; }
                j++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            sum += sheeps[i];
            atk += attacked[i];
        }
        
        System.out.println(atk + " " + sum);
        
        sc.close();
 
    }
}