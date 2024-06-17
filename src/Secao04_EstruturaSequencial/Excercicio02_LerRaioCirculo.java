package Secao04_EstruturaSequencial;

import java.util.Scanner;

public class Excercicio02_LerRaioCirculo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double R, A, pi = 3.14159;
		R = scan.nextDouble();

		A = pi * R * R;
		System.out.printf("A= %.4f%n", A);
		scan.close();
	}
}
