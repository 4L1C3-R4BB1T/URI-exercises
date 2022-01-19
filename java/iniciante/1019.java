import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int seconds = n%60;
        int minutes = n/60;
        int hours = minutes/60;
        minutes = minutes%60;
        
        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
        
        sc.close();
        
    }
}