import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int i = 0, j = 0;
        int par[] = new int[5];
        int impar[] = new int[5];
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            
            if (n % 2 == 0) {
                if (i == 5) {
                    for (int k = 0; k < 5; k++) {
                        System.out.printf("par[%d] = %d\n", k, par[k]);
                    }
                    i = 0;
                }
                par[i] = n;
                i++;
            } else {
                if (j == 5) {
                    for (int k = 0; k < 5; k++) {
                        System.out.printf("impar[%d] = %d\n", k, impar[k]);
                    }
                    j = 0;
                }
                impar[j] = n;
                j++;
            }
        }
        
        for (int k = 0; k < j; k++) {
            System.out.printf("impar[%d] = %d\n", k, impar[k]);
        }
        
        for (int k = 0; k < i; k++) {
            System.out.printf("par[%d] = %d\n", k, par[k]);
        }
        
        sc.close();
 
    }
}