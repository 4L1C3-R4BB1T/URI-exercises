import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String s = "LIFE IS NOT A PROBLEM TO BE SOLVED";    
        
        System.out.println(s.substring(0, n));

        sc.close();
 
    }
}