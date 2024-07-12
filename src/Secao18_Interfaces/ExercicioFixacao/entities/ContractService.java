package Secao18_Interfaces.ExercicioFixacao.entities;

import java.time.LocalDate;

public class ContractService {

	private OnlinePaymentService online;

	public ContractService(OnlinePaymentService online) {
		this.online = online;
	}

	public void processContract(Contract contract, Integer months) {
		double basicQuota = contract.getContractValue() / months;

		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);

			double interest = online.interest(basicQuota, i);
			double fee = online.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;

			contract.getIsntallments().add(new Installment(dueDate, quota));
		}
	}
}
