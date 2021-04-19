public class Main {
    public static void main(String[] args) {
 
        int k = 1;
      
        for (int i = 0; i < 3; i++) {
            for (int j = k; j < (k + 3); j++) {
                System.out.println("I=" + i + " J=" + j);
            }
            if (i < 2) {
                for (int l = 2; l < 9; l += 2) {
                    for (int j = k; j < (k + 3); j++) {
                        System.out.println("I=" + i + "." + l + " J=" + j + "." + l);
                    }
                }
            }
            k++;
        }
 
    }
}