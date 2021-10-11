import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int vet[][] = new int[n][m];
        int iN = 0, iM = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                vet[i][j] = sc.nextInt();
            }
        }
        
        loop1:
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                boolean aux = true;
                
                if (vet[i][j] == 42) {
                    loop2:
                    for (int k = i - 1; k < i + 2; k++) {
                        for (int l = j - 1; l < j + 2; l++) {
                            if ((k != i || l != j) && vet[k][l] != 7) {
                                aux = false;
                                break loop2;
                            }
                        }
                    }
                    
                    if (aux) { iN = i + 1; iM = j + 1; break loop1; }
                }
            }
        }
        
        System.out.printf("%d %d\n", iN, iM);
        
        sc.close();
 
    }
}