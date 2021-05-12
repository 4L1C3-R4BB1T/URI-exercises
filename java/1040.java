import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 		
 		DecimalFormat d = new DecimalFormat("0.0");
        Scanner sc = new Scanner(System.in);
        
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        
        double media = (n1*2 + n2*3 + n3*4 + n4)/10;
        System.out.println("Media: "+ d.format(media));
        
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5) {
            System.out.println("Aluno reprovado.");
        }
        else {
            System.out.println("Aluno em exame.");
    
            double n5 = sc.nextDouble();
            System.out.println("Nota do exame: " + n5);
            
            media = (media + n5)/2;
    
            if (media >= 5) System.out.println("Aluno aprovado.");
            else System.out.println("Aluno reprovado.");
    
            System.out.println("Media final: " + d.format(media));
        }
        
        sc.close();
 
    }
}