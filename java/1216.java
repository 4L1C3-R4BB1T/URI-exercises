import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int cont = 0;
        double total = 0;
        
        while (sc.hasNext()) {
            String name = sc.nextLine();
            total += sc.nextInt();
            sc.nextLine();
            cont++;
        }
        
        System.out.printf("%.1f\n", total/cont);
        
        sc.close();
 
    }
}