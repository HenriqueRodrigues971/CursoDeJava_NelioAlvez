package Secao16_JogoDeXadres.application;

import java.util.Scanner;

import Secao16_JogoDeXadres.xadres.PartidaXadres;
import Secao16_JogoDeXadres.xadres.PecaXadres;
import Secao16_JogoDeXadres.xadres.XadresPosicao;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PartidaXadres partida = new PartidaXadres();
		while (true) {
			UI.desenharTabuleiro(partida.recebePecas());
			System.out.println();
			System.out.print("Origem: ");
			XadresPosicao origem = UI.lerPosicaoXadres(sc);

			System.out.println();
			System.out.print("Destino: ");
			XadresPosicao destino = UI.lerPosicaoXadres(sc);

			PecaXadres pecaCapturada = partida.performaXadresMovimento(origem, destino);
		}
	}
}
