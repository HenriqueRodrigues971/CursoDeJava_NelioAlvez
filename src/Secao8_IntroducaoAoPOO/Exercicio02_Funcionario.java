package Secao8_IntroducaoAoPOO;


public class Exercicio02_Funcionario {
	String name;
	double grossSalary;
	double tax;

	public void increaseSalary(double porcentage) {
		grossSalary += grossSalary * porcentage / 100.0;
	}

	public double NetSalary() {
		return grossSalary - tax;
	}

	@Override
	public String toString() {
		return name + ", $" + String.format("%.2f", NetSalary());
	}


}