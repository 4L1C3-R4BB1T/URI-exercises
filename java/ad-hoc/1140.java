import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String[] phrase = sc.nextLine().split(" ");
            
            if (phrase[0].equals("*")) break;
            
            char firstLetter = Character.toLowerCase(phrase[0].charAt(0));
            
            boolean aux = true;
            
            for (int i = 1; i < phrase.length; i++) {
                if (!(Character.toLowerCase(phrase[i].charAt(0)) == firstLetter)) {
                    aux = false; 
                    break;
                }
            }
            
            System.out.println(aux ? "Y" : "N");
        }
        
        sc.close();
 
    }
}