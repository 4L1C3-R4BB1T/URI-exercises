import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int aux = sc.nextInt();
        
        int dif = 0;
        int escadinha = 0;
        
        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();
            
            int difConsec = aux - num;
            
            if (difConsec != dif) {
                escadinha++;
                dif = difConsec;
            } else if (i == 1) {
                escadinha++;  
            }
            
            aux = num;
        }
        
        System.out.println(n == 1 ? 1 : escadinha);
        
        sc.close();
 
    }
}