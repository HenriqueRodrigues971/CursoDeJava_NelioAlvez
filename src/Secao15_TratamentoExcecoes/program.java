package Secao15_TratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			String vect[] = sc.nextLine().split(" ");/* Split diz que vai salavr um elemento a cada separação vazia */

			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");

		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		System.out.println("Fim do programa!");
		sc.close();
	}
}
