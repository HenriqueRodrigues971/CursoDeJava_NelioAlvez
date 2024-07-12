package Secao18_Interfaces.DeafaultMethods.services;

public class BrazilInterestMethod implements InterestService {
	private double interestService;

	public BrazilInterestMethod(double interestService) {
		this.interestService = interestService;
	}

	@Override
	public double getInterestRate() {
		return interestService;
	}

}
