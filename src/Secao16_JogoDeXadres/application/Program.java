package Secao16_JogoDeXadres.application;

import Secao16_JogoDeXadres.xadres.PartidaXadres;

public class Program {
	public static void main(String[] args) {
		PartidaXadres partida = new PartidaXadres();
		UI.desenharTabuleiro(partida.recebePecas());
	}
}
