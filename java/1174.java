import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        double a[] = new double[100];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
            if (a[i] < 11) System.out.println("A[" + i + "] = " + a[i]);
        }
       
        sc.close();
    
    }
}