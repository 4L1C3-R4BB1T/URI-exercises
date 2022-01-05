import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Map<Integer, Integer> map = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (map.containsKey(x)) {
                map.put(x, map.get(x)+1);
            } else {
                map.put(x, 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> num : map.entrySet()) {
            System.out.printf("%d aparece %d vez(es)\n", num.getKey(), num.getValue());
        }
          
        sc.close();
        
    }
}