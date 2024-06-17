package Secao10_Memorias_Arrays;

import java.util.Scanner;

public class Exercicio01_ProblemasNegativos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Quantos numero vai digitar? ");
		int numeroMax = sc.nextInt();

		int[] nDigitado = new int[numeroMax];

		for (int i = 0; i < nDigitado.length; i++) {
			System.out.println("Digite um numero: ");
			nDigitado[i] = sc.nextInt();
		}
		System.out.println("Numeros Negativos: ");
		for (int i = 0; i < numeroMax; i++) {
			if (nDigitado[i] < 0) {
				System.out.println(nDigitado[i]);
			}
		}
		sc.close();
	}
}
