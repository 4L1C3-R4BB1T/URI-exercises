import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Set<String> s = new HashSet<>();
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            s.add(sc.next());   
        }
        
        System.out.printf("Falta(m) %d pomekon(s).\n", 151 - s.size());
        
        sc.close();
        
    }
}