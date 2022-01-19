public class Main {
    public static void main(String[] args) {
 
        int k = 7;
 
        for (int i = 1; i < 10; i +=2) {
            for (int j = k; j > (k - 3); j--) {
                System.out.println("I=" + i + " J=" + j);
            }
            k += 2;
        }
 
    }
}