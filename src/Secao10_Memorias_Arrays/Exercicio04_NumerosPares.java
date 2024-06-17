package Secao10_Memorias_Arrays;

import java.util.Scanner;

public class Exercicio04_NumerosPares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros vai digitar?");
		int n = sc.nextInt();

		int[] digitos = new int[n];
		int countPares = 0;

		for (int i = 0; i < digitos.length; i++) {

			System.out.println("Digite um numero: ");
			digitos[i] = sc.nextInt();

			if (digitos[i] % 2 == 0) {
				countPares++;
			}

		}
		System.out.println("NUMEROS PARES: ");
		for (int i = 0; i < digitos.length; i++) {
			if (digitos[i] % 2 == 0) {
				System.out.print(digitos[i] + " ");
			}
		}
		System.out.println("\nQUANTIDADE DE PARES: " + countPares);
		sc.close();
	}
}
