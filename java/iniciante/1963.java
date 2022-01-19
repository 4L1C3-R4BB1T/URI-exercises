import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        
        System.out.printf("%.2f%%\n", ((b-a)/a)*100);
        
        sc.close();
        
    }   
}