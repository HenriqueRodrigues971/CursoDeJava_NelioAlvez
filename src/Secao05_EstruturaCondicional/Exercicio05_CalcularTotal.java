package Secao05_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio05_CalcularTotal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int item, qtd;
		System.out.println("Digite o codigo do item e a quantidade: ");
		item = scan.nextInt();
		qtd = scan.nextInt();

		switch (item) {
		case 1:
			System.out.printf("Item: %d - Cachorro Quente, qtd = %d, total = %.2f", item, qtd, qtd * 4.00);
			break;
		case 2:
			System.out.printf("Item: %d - X-Salada, qtd = %d, total = %.2f", item, qtd, qtd * 4.50);
			break;
		case 3:
			System.out.printf("Item: %d - X-Bacon, qtd = %d, total = %.2f", item, qtd, qtd * 5.00);
			break;
		case 4:
			System.out.printf("Item: %d - Torrada Simples, qtd = %d, total = %.2f", item, qtd, qtd * 2.00);
			break;
		case 5:
			System.out.printf("Item: %d - Refrigerante, qtd = %d, total = %.2f", item, qtd, qtd * 1.50);
			break;
		default:
			System.out.println("Item não encontrado ou caracter errado!");
			break;
		}
	scan.close();
	}
}
