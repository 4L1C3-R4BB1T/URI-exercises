import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt();
        int t = sc.nextInt();
        int f = sc.nextInt();
        
        int hour = s + t + f;
        
        if (hour == 24) hour = 0;
        else if (hour < 0) hour = 24 + hour;
        else if (hour > 24) hour -= 24;
        
        System.out.println(hour);

        sc.close();
 
    }
}