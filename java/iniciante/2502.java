import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int c = sc.nextInt();
            int n = sc.nextInt();
            
            sc.nextLine();
            
            String cp = sc.nextLine().trim();
            char cipher[] = new char[c];
  
            String ky = sc.nextLine().trim();
            char key[] = new char[c];
            
            for (int i = 0; i < c; i++) {
                cipher[i] = Character.toLowerCase(cp.charAt(i));
                key[i] = Character.toLowerCase(ky.charAt(i));
            }
            
            for (int i = 0; i < n; i++) {
                String p = sc.nextLine();
                char phrase[] = new char[p.length()];
                
                for (int j = 0; j < p.length(); j++) {
                    phrase[j] = p.charAt(j);
                    
                    for (int k = 0; k < c; k++) {
                        char up_cipher = Character.toUpperCase(cipher[k]);
                        char up_key = Character.toUpperCase(key[k]);
                        
                        if (phrase[j] == key[k]) {
                            phrase[j] = cipher[k]; 
                        } else if (phrase[j] == cipher[k]) {
                            phrase[j] = key[k];
                        } else if (phrase[j] == up_key) {
                            phrase[j] = up_cipher;
                        } else if (phrase[j] == up_cipher) {
                            phrase[j] = up_key;
                        }
                    }
                }
                
                for (char ch : phrase) {
                    System.out.printf("%c", ch);
                }
                
                System.out.println();
            }
            
            System.out.println();
        }
        
        sc.close();
        
    }
}