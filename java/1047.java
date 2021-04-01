import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int startHour = sc.nextInt();
		int startMinute = sc.nextInt();
        
        int finishHour = sc.nextInt();
        int finishMinute = sc.nextInt();
        
        int difHours = finishHour - startHour;
        int difMinutes = finishMinute - startMinute;

        if (difMinutes < 0) { 
            difHours--;
            difMinutes += 60;
        }
        
        if (difHours < 0) {
            difHours += 24;
        }

        if (difHours == 0 && difMinutes == 0) {
            difHours = 24;
        }

		System.out.println("O JOGO DUROU "+ difHours + " HORA(S) E " + difMinutes + " MINUTO(S)");
		
		sc.close();
		
	}
}