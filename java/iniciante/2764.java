import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        String date = sc.nextLine();
        String nums[] = date.split("/"); 
        
        System.out.println(nums[1] + "/" + nums[0] + "/" + nums[2]);
        System.out.println(nums[2] + "/" + nums[1] + "/" + nums[0]);
        System.out.println(nums[0] + "-" + nums[1] + "-" + nums[2]);
        
        sc.close();
 
    }
}