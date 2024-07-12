package Secao18_Interfaces.ExercicioFixacao.entities;

public class PaypalPayment implements OnlinePaymentService {

	private static final double PAYMENT_FEE_PERCETAGE = 0.02;
	private static final double PAYMENT_INTEREST_PERCETAGE = 0.01;

	@Override
	public Double paymentFee(double amount) {
		return  amount * PAYMENT_FEE_PERCETAGE;
	}

	@Override
	public Double interest(double amount, Integer month) {
		return amount * PAYMENT_INTEREST_PERCETAGE * month;
	}

}
