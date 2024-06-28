package Secao15_ExercicioFixacao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import Secao15_ExercicioFixacao.entities.Account;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Coloque os dados da conta: ");
		try {
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Titular: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Saldo inicial: ");
			double saldoInicial = sc.nextDouble();
			System.out.println("Limite de saque: ");
			double limite = sc.nextDouble();
			Account c1 = new Account(number, name, saldoInicial, limite);

			System.out.println("Digite um valor de saque: ");
			double saque = sc.nextDouble();
			c1.withDraw(saque);
			System.out.println(c1);
		} catch (InputMismatchException e) {
			System.out.println("Erro de entrada: insira valores validos");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro de operação: " + e.getMessage());
		} finally {
			sc.close();

		}
	}
}
