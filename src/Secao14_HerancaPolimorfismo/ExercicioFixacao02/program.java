package Secao14_HerancaPolimorfismo.ExercicioFixacao02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Secao14_HerancaPolimorfismo.ExercicioFixacao02.entities.Pessoa;
import Secao14_HerancaPolimorfismo.ExercicioFixacao02.entities.PessoaFisica;
import Secao14_HerancaPolimorfismo.ExercicioFixacao02.entities.PessoaJuridica;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();

		System.out.print("Quantas pessoa deseja cadastrar?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Cadastro #" + i);
			System.out.print("Fisica ou Juridica(f/j)?");
			char ch = sc.next().charAt(0);

			if (ch == 'f') {
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Renda Anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Gastos com saúde: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			} else if (ch == 'j') {
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Renda Anual");
				double rendaAnual = sc.nextDouble();
				System.out.print("Número de funcionarios: ");
				int numeroFuncionario = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionario));
			}

		}
		System.out.println();
		System.out.println("Total com imposto de casa: ");
		double total = 0;
		for (Pessoa pessoa : list) {
			System.out.printf("%s: $ %.2f\n", pessoa.getNome(), pessoa.calcularImposto());
			total += pessoa.calcularImposto();
		}
		System.out.println();
		System.out.println("Total de taxas: " + total);
		sc.close();
	}
}
