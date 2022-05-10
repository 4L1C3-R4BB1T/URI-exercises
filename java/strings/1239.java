import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String s = sc.nextLine();
            
            // enquanto houverem _ ou *, eles serao substituidos
            while (s.contains("_") || s.contains("*")) {
                s = s.replaceFirst("_", "<i>")
                    .replaceFirst("_", "</i>")
                    .replaceFirst("\\*", "<b>")
                    .replaceFirst("\\*", "</b>");
            }
            
            System.out.println(s);
        }
        
        sc.close();
        
    }
}