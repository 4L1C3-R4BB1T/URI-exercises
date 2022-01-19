public class Main {
    public static void main(String[] args) {
 
        float s = 1;
       
        for (float i = 3, j = 2; i < 40; i += 2, j *= 2) {
            s += i/j;
        }
        
        System.out.printf("%.2f\n", s);
        
    }
}