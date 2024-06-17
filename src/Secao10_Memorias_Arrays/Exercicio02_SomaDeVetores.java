package Secao10_Memorias_Arrays;

import java.util.Scanner;

public class Exercicio02_SomaDeVetores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros você vai digitar?");
		int n = sc.nextInt();

		double[] nVetor = new double[n];
		double soma = 0.0;

		for (int i = 0; i < nVetor.length; i++) {
			System.out.println("Digite um numero: ");
			nVetor[i] = sc.nextInt();
			soma += nVetor[i];
		}

		System.out.print("Valores: ");
		for (int i = 0; i < nVetor.length; i++) {
			System.out.print(String.format("%.1f", nVetor[i]) + " ");

		}

		System.out.println("\nSoma: " + String.format("%.2f", soma));
		double media = soma / n;
		System.out.println("Media: " + media);
		sc.close();
	}
}
