import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            List<String> names =  new ArrayList<String>();
            
            int t = sc.nextInt();
            int exp[][] = new int[t][3];

            for (int i = 0; i < t; i++) {
                exp[i][0] = sc.nextInt(); 
                
                String aux[] = sc.next().split("=");
                
                exp[i][1] = Integer.parseInt(aux[0]);
                exp[i][2] = Integer.parseInt(aux[1]);
            }
            
            for (int j = 0; j < t; j++) {
                String n = sc.next();
                int e = sc.nextInt()-1;
                char r = sc.next().charAt(0);
                
                int x = exp[e][0];
                int y = exp[e][1];
                int z = exp[e][2];
                
                // check if is invalid answer
                if ((r == '+') && (x + y != z) ||
                    (r == '-') && (x - y != z) ||
                    (r == '*') && (x * y != z) ||
                    (r == 'I') && ((x + y == z) || (x - y == z) || (x * y == z))) {
                    names.add(n);
                }
            }
            
            int size = names.size();
            
            if (size == t) {
                System.out.println("None Shall Pass!");
            } else if (size == 0) {
                System.out.println("You Shall All Pass!");
            } else {
                Collections.sort(names);
                for (int k = 0; k < size; k++) {
                    System.out.printf(k == size-1 ? "%s\n" : "%s ", names.get(k));
                }
            }
        }
        
        sc.close();
        
    }
}