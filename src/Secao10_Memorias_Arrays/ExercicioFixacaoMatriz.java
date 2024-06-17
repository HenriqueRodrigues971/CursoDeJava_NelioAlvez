package Secao10_Memorias_Arrays;

import java.util.Scanner;

public class ExercicioFixacaoMatriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a qtd de linhas e colunas");
		int l = sc.nextInt();
		int c = sc.nextInt();

		int[][] mat = new int[l][c];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite o numero para achar a posição: ");
		int nPosicao = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				if (nPosicao == mat[i][j]) {
					System.out.println("Linha: " + i + ", Coluna:" + j);

					if (j - 1 <= 0 || j - 1 >= 0) {
						System.out.println("Left: " + mat[i][j - 1]);

					}
					if (j + 1 < mat[i].length) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i - 1 >= 0) {
						System.out.println("UP: " + mat[i - 1][j]);
					}
					if (i + 1 < mat.length) {
						System.out.println("DOWN: " + mat[i + 1][j]);
					}
					System.out.println();
				}
			}
		}

		sc.close();
	}
}
