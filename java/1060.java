import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int pos = 0;
        
        for (int i = 0; i < 6; i++) {
            if (sc.nextFloat() > 0) pos++;
        }
        
        System.out.println(pos + " valores positivos");
        
        sc.close();
 
    }
}