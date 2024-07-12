package Secao18_Interfaces.DeafaultMethods;

import java.util.Scanner;

import Secao18_Interfaces.DeafaultMethods.services.InterestService;
import Secao18_Interfaces.DeafaultMethods.services.UsaInterestService;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Amount: ");
		double amount = sc.nextDouble();
		System.out.println("Months: ");
		int months = sc.nextInt();

		InterestService is = new UsaInterestService(1.0);
		double payment = is.payment(amount, months);

		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		sc.close();
	}
}
