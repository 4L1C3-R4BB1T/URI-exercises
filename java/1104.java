import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if (a + b == 0) break;
            
            Set<Integer> alice = new HashSet<>();
            Set<Integer> beatriz = new HashSet<>();
            
            for (int i = 0; i < a; i++) {
                int x = sc.nextInt();
                alice.add(x);
            }
            
            for (int i = 0; i < b; i++) {
                int y = sc.nextInt();
                beatriz.add(y);
            }
            
            Set<Integer> intersecao = new HashSet<>(alice);
            intersecao.retainAll(beatriz);

            int cards = Math.min(alice.size(), beatriz.size()) - intersecao.size();

            System.out.println(cards);
        }
        
        sc.close();
 
    }
}