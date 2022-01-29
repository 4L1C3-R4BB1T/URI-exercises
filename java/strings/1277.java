import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            
            sc.nextLine();
            
            String[] names = new String[n];
            String[] frequencies = new String[n];
            
            names = sc.nextLine().split(" ");
            frequencies = sc.nextLine().split(" ");
            
            String students = "";
            
            for (int j = 0; j < n; j++) {
                frequencies[j] = frequencies[j].replace("M", "");
                
                double minPresence = Math.ceil(frequencies[j].length() * 0.75); 
                
                if (frequencies[j].replace("A", "").length() < minPresence) {
                    students += names[j] + " ";    
                }
            }
            
            System.out.println(students.trim());
        }
        
        sc.close();
        
    }
}