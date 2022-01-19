import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int qt = sc.nextInt();
        
        for (int i = 0; i < qt; i++) {
            String nome_1 = sc.next();
            String escolha_1 = sc.next();
            
            String nome_2 = sc.next();
            String escolha_2 = sc.next();
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            if ((n + m) % 2 == 0) {
                if (escolha_1.equals("PAR")) System.out.println(nome_1);
                else System.out.println(nome_2);
            } else {
                if (escolha_1.equals("IMPAR")) System.out.println(nome_1);
                else System.out.println(nome_2);
            }
        }
        
        sc.close();
        
    }
}