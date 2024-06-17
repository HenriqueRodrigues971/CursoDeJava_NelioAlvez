package Secao10_Memorias_Arrays;

import java.util.Scanner;

public class ExercicioFIxacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluguel[] aluguel = new Aluguel[10];
		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email:");
			String email = sc.next();
			System.out.print("Quarto: ");
			int nQuarto = sc.nextInt();

			aluguel[nQuarto] = new Aluguel(nome, email);
		}
		System.out.println();
		System.out.println("Quartos comprados: ");
		for (int i = 0; i < 10; i++) {
			if (aluguel[i] != null) {
				System.out.println(i + ": " + aluguel[i]);
			}
		}
		sc.close();
	}
}
