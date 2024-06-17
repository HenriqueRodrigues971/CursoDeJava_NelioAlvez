package Secao04_EstruturaSequencial;

import java.util.Locale;

public class SaidaDeDadosExercicioFixacao {
	public static void main(String[] args) {
		String product1 = "computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'f';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products: ");
		System.out.printf("%s, whith price is $ %.2f\n", product1, price1);
		System.out.printf("%s, whith price is $ %.2f\n", product2, price2);
	//	System.out.println();
		System.out.printf("\nRecord: %d years old, code %d and gender: %s\n", age, code, gender);
		System.out.println();
		System.out.printf("Measue whith eight decimal places: %f\n", measure);
		System.out.printf("Rouded (three decimal places: %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);

	}
}
