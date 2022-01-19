import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        
        for (int i = 0; i < 9; i++) {
            sum += sc.nextInt();
        }
        
        String name = "Rudolph";
        
        switch (sum % 9) {
            case 1: name = "Dasher"; break;
            case 2: name = "Dancer"; break;
            case 3: name = "Prancer"; break;
            case 4: name = "Vixen"; break;
            case 5: name = "Comet"; break;
            case 6: name = "Cupid"; break;
            case 7: name = "Donner"; break;
            case 8: name = "Blitzen"; 
        }
        
        System.out.println(name);
        
        sc.close();
 
    }
}