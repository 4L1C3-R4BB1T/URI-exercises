import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        float b = sc.nextFloat();
        char c = sc.next().charAt(0);   
        
        String s[] = sc.nextLine().split("");
        String d = "";
        for (int i = 1; i < s.length; i++) d += s[i];
        
        System.out.printf("%d%.6f%c%s\n", a, b, c, d);
        System.out.printf("%d\t%.6f\t%c\t%s\n", a, b, c, d);
        System.out.printf("%10d%10.6f%10c%10s\n", a, b, c, d);

        sc.close();
        
    }
}