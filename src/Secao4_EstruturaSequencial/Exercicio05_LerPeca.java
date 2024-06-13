package Secao4_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio05_LerPeca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double valorPeca1, valorPeca2, valorTotal;

		codPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();

		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		valorTotal = (valorPeca1 * numPeca1) + (valorPeca2 * numPeca2);

		System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
		sc.close();
	}
}
