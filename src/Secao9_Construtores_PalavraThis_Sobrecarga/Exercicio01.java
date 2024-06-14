package Secao9_Construtores_PalavraThis_Sobrecarga;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContaBancaria c = new ContaBancaria();
		
		System.out.println("Adicione o nome do tituar: ");
		String nome = scan.nextLine();

		System.out.println("Adicione o numero da conta: ");
		int conta = scan.nextInt();

		System.out.println("Deseja fazer um deposito inicial? y/n");
		char escolha = scan.next().charAt(0);

		if (escolha == 'y') {
			System.out.println("Qual o valor de deposito: ");
			double valorDeposito = scan.nextDouble();
			c = new ContaBancaria(conta, nome, valorDeposito);
			System.out.println(c.toString());

		} else {
			c = new ContaBancaria(conta, nome);
			System.out.println(c.toString());
		}
		System.out.println("Adicione um valor para deposito: ");
		double valorDeposito2 = scan.nextDouble();
		c.depositoConta(valorDeposito2);
		System.out.println("Conta atualizada: ");
		System.out.println(c.toString());

		System.out.println("Digite o valor do saque: ");
		double saque = scan.nextDouble();
		c.saqueConta(saque);
		System.out.println("Conta Atualizada");
		System.out.println(c.toString());

		System.out.println("Deseja atualizar o nome do titular: (y/n)?");
		char esc = scan.next().charAt(0);
		scan.nextLine();
		if (esc == 'y') {
			System.out.println("Insira o nome novo: ");
			String nomeNovo = scan.nextLine();
			c.atualizarNome(nomeNovo);
			System.out.println(c.toString());
		}
		System.out.println(c.toString());
		scan.close();
	}
}
