import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        double salary = sc.nextDouble(), value = 0, percent = 0;
        
        if (salary > 2000) percent = 0.04;
        else if (salary > 1200) percent = 0.07;
        else if (salary > 800) percent = 0.1;
        else if (salary > 400) percent = 0.12;
        else percent = 0.15;
        
        value = salary*percent;
        salary += value;
    
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %.0f %%\n", salary, value, (percent*100));
        
        sc.close();
 
    }
}