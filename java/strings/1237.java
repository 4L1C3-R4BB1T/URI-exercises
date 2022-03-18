import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String strA = sc.nextLine();
            String strB = sc.nextLine();
            
            int max = 0;
            
            for (int i = 0; i < strA.length(); i++) {
                for (int j = i + 1; j <= strA.length(); j++) {
                    if (strB.contains(strA.substring(i, j))) {
                        int length = strA.substring(i, j).length();
                        if (length > max) max = length;
                    }
                }
            }
            
            System.out.println(max);
        }
        
        sc.close();
        
    }
}