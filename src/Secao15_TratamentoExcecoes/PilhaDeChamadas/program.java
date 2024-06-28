package Secao15_TratamentoExcecoes.PilhaDeChamadas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {

		method1();

		System.out.println("Fim do programa!");
	}

	public static void method1() {
		System.out.println("-----Method1 start-----");
		method2();
		System.out.println("-----Method1 stop-----");
	}

	public static void method2() {
		System.out.println("-----Method2 start-----");
		Scanner sc = new Scanner(System.in);

		try {
			String vect[] = sc.nextLine().split(" ");/* Split diz que vai salavr um elemento a cada separação vazia */

			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
			e.printStackTrace();

		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("-----Method2 end-----");
	}
}