import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        
        while (sc.hasNext()) {
            String s = sc.nextLine().trim();
            
            if (s.equals("caw caw")) {
                System.out.println(sum);
                sum = 0;
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '*') {
                        if (i == 0) sum += 4; 
                        else if (i == 1) sum += 2;
                        else sum += 1;
                    } 
                }
            }
        } 
        
        sc.close();
        
    }
}