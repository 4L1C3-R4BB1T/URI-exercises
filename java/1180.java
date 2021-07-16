import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int aux = sc.nextInt(), index = 0;

        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            if (x < aux) { index = i; aux = x; }
        }
        
        System.out.printf("Menor valor: %d\nPosicao: %d\n", aux, index);

        sc.close();
 
    }
}