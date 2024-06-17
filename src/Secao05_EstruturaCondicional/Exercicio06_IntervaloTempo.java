package Secao05_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio06_IntervaloTempo {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double n = scan.nextDouble();
    
    if(n >= 0 && n <= 25)System.out.println("Intervalo (0-25)");
    else if (n > 25 && n <= 50) System.out.println("Intervalo (25-50)");
    else if(n > 50 && n <= 75) System.out.println("Intevalo (50-75)");
    else if(n > 75 && n <= 100)System.out.println("Intervalo (75-100"); 
    else System.out.println("fora de intervalo");
    scan.close();
	}
}
