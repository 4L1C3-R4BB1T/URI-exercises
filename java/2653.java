import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        Set<String> jewels = new HashSet<>();
        
        while (sc.hasNext()) {
            jewels.add(sc.next());
        }
    
        System.out.println(jewels.size());
        
        sc.close();
 
    }
}