import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int days = sc.nextInt();
        
        int years = days / 365;
        days %= 365;
        
        int months = days / 30;
        days %= 30;
        
        System.out.println(years + " ano(s)\n" + months + " mes(es)\n" + days + " dia(s)");
        
        sc.close();
 
    }
}