package Secao18_Interfaces.ExercicioFixacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Secao18_Interfaces.ExercicioFixacao.entities.Contract;
import Secao18_Interfaces.ExercicioFixacao.entities.ContractService;
import Secao18_Interfaces.ExercicioFixacao.entities.Installment;
import Secao18_Interfaces.ExercicioFixacao.entities.PaypalPayment;

public class program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Número: ");
		int contractNumber = sc.nextInt();
		System.out.print("Data(dd/MM/yyy)");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();

		Contract contract = new Contract(contractNumber, date, contractValue);

		System.out.println("Entre com o número de parcelas: ");
		int installmentsNumber = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalPayment());
		contractService.processContract(contract, installmentsNumber);

		System.out.println("Parcelas: ");
		for (Installment installment : contract.getIsntallments()) {
			System.out.println(installment);
		}
		sc.close();
	}
}
