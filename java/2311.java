import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String nome = sc.next();
            double gd = sc.nextDouble();
            
            double soma = 0;
            double maior = 0;
            double menor = 0;
            
            for (int j = 0; j < 7; j++) {
                double nota = sc.nextDouble(); 
                soma += nota;
                
                if (j == 0) { 
                    maior = nota; 
                    menor = nota; 
                } else if (nota > maior) {
                    maior = nota;
                } else if (nota < menor) {
                    menor = nota;
                }
            }
            
            System.out.printf("%s %.2f\n", nome, (soma-maior-menor)*gd);
        }
        
        sc.close();
        
    }
}