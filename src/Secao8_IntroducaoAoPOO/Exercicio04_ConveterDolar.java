package Secao8_IntroducaoAoPOO;

import java.util.Scanner;

public class Exercicio04_ConveterDolar {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Exercicio04_CurrencyConverter c = new Exercicio04_CurrencyConverter();
	
	System.out.print("What is the dollar price? " );
	c.dollarPrice = sc.nextDouble();
	System.out.println("How many dollars will be bought? ");
	c.buyDollars = sc.nextDouble();
	System.out.println(c);
	sc.close();
}
}
