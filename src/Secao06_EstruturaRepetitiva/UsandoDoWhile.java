package Secao06_EstruturaRepetitiva;

import java.util.Scanner;

public class UsandoDoWhile {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	char resp;
	do {
		System.out.println("Digite a temperatura em celsius");
		double c= scan.nextDouble();
		double f = 9.0 * c / 5.0 * 32.0;
		System.out.printf("Equivalente a Fahrenheit %.2f\n",f);
		System.out.println("deseja repetir? (s/n)");
		resp = scan.next().charAt(0);
	}while(resp != 'n');
	scan.close();
}
}
