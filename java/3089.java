import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n > 0) {
			int[] prices = new int[2*n];
				
			for (int i = 0; i < 2*n; i++) {
				prices[i] = sc.nextInt();
			}
				
			if (prices.length == 2) {
				int sum = prices[0] + prices[1];
				System.out.println(sum + " " + sum);
			} else {
				int[] sums = new int[prices.length/2];
				
				for (int j = 0; j < prices.length/2; j++) {
					sums[j] = prices[j] + prices[prices.length - 1 - j];
				}
					
				int max = sums[0], min = sums[0];
				
				for (int k = 1; k < sums.length; k++) {
					if (sums[k] > max) max = sums[k];
					if (sums[k] < min) min = sums[k];
				}
					
				System.out.println(max + " " + min);	
	 		}	
			n = sc.nextInt();
		}

		sc.close();

	}
}
