import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        
        double price = 0;
        
        if (cod == 1) price = qtd*4;
        else if (cod == 2) price = qtd*4.5;
        else if (cod == 3) price = qtd*5;
        else if (cod == 4) price = qtd*2;
        else price = qtd*1.5;
        
        System.out.printf("Total: R$ %.2f\n", price);
        
        sc.close();
 
    }
}