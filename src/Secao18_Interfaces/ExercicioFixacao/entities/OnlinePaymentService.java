package Secao18_Interfaces.ExercicioFixacao.entities;

public interface OnlinePaymentService {
  Double paymentFee(double amount);
  Double interest(double amount, Integer month);
}
