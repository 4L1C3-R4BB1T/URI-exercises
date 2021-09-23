import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int maria = 0, joao = 0;
            
            for (int j = 0; j < 3; j++) {
                joao += sc.nextInt()*sc.nextInt();
            }
            
            for (int j = 0; j < 3; j++) {
                maria += sc.nextInt()*sc.nextInt();
            }
            
            System.out.println(maria > joao ? "MARIA" : "JOAO");
        }
        
        sc.close();
 
    }
}