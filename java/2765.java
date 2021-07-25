import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        String phrase = sc.nextLine();
        String arr[] = phrase.split(",");
        
        System.out.printf("%s\n%s\n", arr[0], arr[1]);
        
        sc.close();
 
    }
}