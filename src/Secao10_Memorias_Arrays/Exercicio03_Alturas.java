package Secao10_Memorias_Arrays;

import java.util.Scanner;

public class Exercicio03_Alturas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoa serão digitada?");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		double soma = 0.0;
		int countMenores16 = 0;

		for (int i = 0; i < nome.length; i++) {
			System.out.printf("Dados da %d pessoa\n", i + 1);
			sc.nextLine();
			System.out.println("Nome: ");
			nome[i] = sc.nextLine();
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
			System.out.println("Altura: ");
			altura[i] = sc.nextDouble();
			soma += altura[i];
			if (idade[i] < 16) {
				countMenores16++;
			}

		}
		double media = soma / n;

		System.out.println(String.format("ALTURA MEDIA: %.2f", media));

		System.out.println("Pessoa com menos de 16 anos: ");

		double porcentagemMenores16 = ((double) countMenores16 / n) * 100;
		System.out.println(String.format("PERCENTUAL DE PESSOAS COM MENOS DE 16 ANOS: %.1f%%", porcentagemMenores16));

		for (int i = 0; i < idade.length; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}
}
