import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String sit = sc.nextLine();
        
            if (sit.equals("esquerda")) System.out.println("ingles");
            else if (sit.equals("direita")) System.out.println("frances");
            else if (sit.equals("nenhuma")) System.out.println("portugues");
            else System.out.println("caiu");
        }
        
        sc.close();
 
    }
}