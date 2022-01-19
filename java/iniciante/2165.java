import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        String t = sc.nextLine();
        
        System.out.println(t.length() > 140 ? "MUTE" : "TWEET");
       
        sc.close();
 
    }
}