import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        double valor = sc.nextDouble();
        
        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
        
        System.out.println("NOTAS:");
        for (int nota : notas) {
            int qtdNotas = (int) (valor/nota);
            valor %= nota;
            System.out.printf("%d nota(s) de R$ %.2f\n", qtdNotas, (double) nota);
        }
     
        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            valor = Math.round(valor*100.0)/100.0;
            int qtdMoedas = (int) (valor/moeda);
            valor %= moeda;
            System.out.printf("%d moeda(s) de R$ %.2f\n", qtdMoedas, (double) moeda);
        }
        
        sc.close();
        
    }
}