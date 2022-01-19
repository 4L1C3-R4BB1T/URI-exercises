import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        String a = sc.next();
        String[] arr = a.split("\\.");
       
        System.out.printf("%d.%d\n", Integer.parseInt(arr[1]), Integer.parseInt(arr[0])); 

        sc.close();
 
    }
}