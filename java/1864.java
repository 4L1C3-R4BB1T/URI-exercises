import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        char letters[] = {'L', 'I', 'F', 'E', ' ', 'I', 'S', ' ', 
            'N', 'O', 'T', ' ', 'A', ' ', 'P', 'R', 'O', 'B', 'L', 'E', 'M', ' ', 
            'T', 'O', ' ', 'B', 'E', ' ', 'S', 'O', 'L', 'V', 'E', 'D'};
        
        for (int i = 0; i < n; i++) System.out.print(letters[i]); 
        
        System.out.print('\n');

        sc.close();
 
    }
}