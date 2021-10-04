public class Main {
    public static void main(String[] args) {
 
        float s = 1;
       
        for (float i = 2; i < 101; i++) {
            s += 1/i;
        }
        
        System.out.printf("%.2f\n", s);
        
    }
}