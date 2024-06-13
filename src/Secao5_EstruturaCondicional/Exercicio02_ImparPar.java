package Secao5_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio02_ImparPar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Digite o numero: ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

		sc.close();
	}
}
