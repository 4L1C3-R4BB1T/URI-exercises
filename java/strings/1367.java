import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        while ((n = sc.nextInt()) != 0) {
            List<String> submissions = new ArrayList<>();
            
            int solved = 0;
            int totalTime = 0;
            
            for (int i = 0; i < n; i ++) {
                String problem = sc.next();
                int time = sc.nextInt();
                String judgement = sc.next();
                
                submissions.add(problem);
                
                if (judgement.equals("correct")) {
                    solved++;
                    totalTime += time;
                    // remove all occurrences of a problem
                    submissions.removeIf(problem::equals);
                } else {
                    totalTime += 20;
                }
            }
            
            // removes the time counted for unresolved problems
            System.out.println(solved + " " + (totalTime - submissions.size()*20));
        }
        
        sc.close();
        
    }
}