import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String problem = sc.next();
            
            if (problem.equals("P=NP")) {
                System.out.println("skipped");
            } else {
                String values[] = problem.split("\\+");
                System.out.println(Integer.parseInt(values[0]) + Integer.parseInt(values[1]));
            }
        }
        
        sc.close();
 
    }
}