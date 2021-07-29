import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int nums[] = new int[3], numSort[] = new int[3];
        
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
            numSort[i] = nums[i];
        }
        
        Arrays.sort(numSort);
        
        for (int n : numSort) System.out.printf("%d\n", n);
        
        System.out.printf("\n");
        
        for (int n : nums) System.out.printf("%d\n", n);
        
        sc.close();
 
    }
}