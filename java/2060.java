import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int mTwo = 0, mThree = 0, mFour = 0, mFive = 0;
        
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            if (l % 2 == 0) mTwo++;
            if (l % 3 == 0) mThree++;
            if (l % 4 == 0) mFour++;
            if (l % 5 == 0) mFive++;
        }
        
        System.out.println(mTwo + " Multiplo(s) de 2\n" 
            + mThree + " Multiplo(s) de 3\n" + mFour + " Multiplo(s) de 4\n" 
            + mFive + " Multiplo(s) de 5");
        
        sc.close();
 
    }
}