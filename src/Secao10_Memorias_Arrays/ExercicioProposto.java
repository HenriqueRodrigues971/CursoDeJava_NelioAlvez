package Secao10_Memorias_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionarioLista = new ArrayList<>();
		Funcionario funcionario;
		System.out.println("Quantos funcionario deseja registrar?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			boolean idExistente;
			do {
				System.out.println("Id: ");
				int id = sc.nextInt();

				idExistente=false;
				for (Funcionario f : funcionarioLista) {
					if (f.getId() == id) {
						idExistente = true;
						break;
					}
				}

				if (idExistente) {
					System.out.println("Id já existente!");
				}else {

				System.out.println("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();

				System.out.println("Salario: ");
				double salario = sc.nextDouble();

				funcionario = new Funcionario(id, nome, salario);

				funcionarioLista.add(funcionario);
				}
			} while (idExistente);
		}
		System.out.println("Digite o id do funcionario que sera aumentado o salario: ");
		int idAumento = sc.nextInt();
		for (Funcionario f : funcionarioLista) {
			if (f.getId() == idAumento) {
				System.out.println("Informe a porcentagem do aumento: ");
				double porcentagem = sc.nextDouble();
				f.aumentoSalario(porcentagem);
				break;
			}
			System.out.println("Id não existente");
		}

		System.out.println("Lista de funcionarios: ");
		for (Funcionario f : funcionarioLista) {
			System.out.println(f);
		}
		sc.close();
	}
}
