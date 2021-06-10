import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int cod = 0, contA = 0, contG = 0, contD = 0;
        
        while (cod != 4) {
            cod = sc.nextInt();
                
            if (cod == 1) contA++;
            else if (cod == 2) contG++;
            else if (cod == 3) contD++;
        }
        
        System.out.println("MUITO OBRIGADO\nAlcool: " + contA + "\nGasolina: "
            + contG + "\nDiesel: " + contD);
        
        sc.close();
 
    }
}