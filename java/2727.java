import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            
            sc.nextLine();
            
            for (int i = 0; i < n; i++) {
                String cod[] = sc.nextLine().split(" ");
                char c = (char) (96 + (cod.length-1)*3 + cod[0].length());
                System.out.println(c);
            }
        }
        
        sc.close();
 
    }
}