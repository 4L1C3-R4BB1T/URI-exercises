import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        String wordOne = sc.nextLine();
        String wordTwo = sc.nextLine();
        String wordThree = sc.nextLine();
        
        if (wordOne.equals("vertebrado")) {
            if (wordTwo.equals("ave")) {
                if (wordThree.equals("carnivoro")) System.out.println("aguia");
                else System.out.println("pomba");
            } else {
                if (wordThree.equals("onivoro")) System.out.println("homem");
                else System.out.println("vaca");
            }
        } else {
            if (wordTwo.equals("inseto")) {
                if (wordThree.equals("hematofago")) System.out.println("pulga");
                else System.out.println("lagarta");
            } else {
                if (wordThree.equals("hematofago")) System.out.println("sanguessuga");
                else System.out.println("minhoca");
            }
        } 
            
        sc.close();
 
    }
}