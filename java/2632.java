import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(), r = 0, d = 0;
        
        int fire[] = {200, 20, 30, 50};
        int water[] = {300, 10, 25, 40};
        int earth[] = {400, 25, 55, 70};
        int air[] = {100, 18, 38, 60};
        
        for (int i = 0; i < t; i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            String magic = sc.next();
            int n = sc.nextInt();
            int cX = sc.nextInt();
            int cY = sc.nextInt();
            
            if (magic.equals("fire")) { r = fire[n]; d = fire[0]; } 
            else if (magic.equals("water")) { r = water[n]; d = water[0]; } 
            else if (magic.equals("earth")) { r = earth[n]; d = earth[0]; } 
            else { r = air[n]; d = air[0]; } 
        
            System.out.println(intersection(cX, cY, x, y, w, h, r) ? d : "0");
        }
        
        sc.close();
 
    }
    
    static boolean intersection(int cX, int cY, int x, int y, int w, int h, int r) {
        for (int i = x; i <= (x+w); i++) {
            for (int j = y; j <= (y+h); j++) {
                if (Math.sqrt(Math.pow(cX-i, 2) + Math.pow(cY-j, 2)) <= r) 
                    return true;
            }
        }
        return false;
    }
}