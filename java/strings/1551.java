import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String phrase = sc.nextLine();
            
            Set letters = new HashSet();
            
            for (int j = 0; j < phrase.length(); j++) {
                char c = phrase.charAt(j);
                if (Character.isLetter(c)) letters.add(c);
            }
            
            if (letters.size() == 26) System.out.println("frase completa");
            else if (letters.size() >= 13) System.out.println("frase quase completa");
            else System.out.println("frase mal elaborada");
        }
        
        sc.close();
        
    }
}