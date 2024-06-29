package Secao16_JogoDeXadres.xadres;

import Secao16_JogoDeXadres.boardgame.Position;
import Secao16_JogoDeXadres.boardgame.Tabuleiro;
import Secao16_JogoDeXadres.xadres.pecas.Rei;
import Secao16_JogoDeXadres.xadres.pecas.Torre;

public class PartidaXadres {
	private Tabuleiro tabuleiro;

	public PartidaXadres() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarSetup();
	}

	public PecaXadres[][] recebePecas() {
		PecaXadres[][] mat = new PecaXadres[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadres) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}

	private void iniciarSetup() {
		tabuleiro.posicionarPeca(new Torre(tabuleiro, Color.WHITE), new Position(2, 1));
		tabuleiro.posicionarPeca(new Rei(tabuleiro, Color.BLACK), new Position(0, 4));
		tabuleiro.posicionarPeca(new Rei(tabuleiro, Color.WHITE), new Position(7, 4));
	}
}
