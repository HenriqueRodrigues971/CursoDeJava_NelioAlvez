package Secao8_IntroducaoAoPOO;

public class Exercicio03_Student {
	String name;
	double n1, n2, n3, total;
	boolean situation;

	public void notasAlunos(double num1, double num2, double num3) {
		total = num1 + num2 + num3;
		situation = (total >= 60);
		if (situation) {
			System.out.println("Final Grade: " + String.format("%.2f", total));
			System.out.println("PASS");
		} else {
			System.out.println("Final Grade: " + String.format("%.2f", total));
			System.out.println("FAILED");
			System.out.println("MISSING: " + (60.0 - total) + " POINTS");
		}
	}
}
