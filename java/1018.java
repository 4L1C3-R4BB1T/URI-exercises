import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int qtd, notas[] = {100, 50, 20, 10, 5, 2, 1};
      
        System.out.println(n);
        
        for (int nota : notas) {
            qtd = n/nota;
            n -= qtd * nota;
            System.out.printf("%d nota(s) de R$ %d,00\n", qtd, nota);
        }
           
        sc.close();
 
    }
}