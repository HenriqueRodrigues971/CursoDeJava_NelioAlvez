package Secao16_JogoDeXadres.xadres.pecas;

import Secao16_JogoDeXadres.boardgame.Tabuleiro;
import Secao16_JogoDeXadres.xadres.Color;
import Secao16_JogoDeXadres.xadres.PecaXadres;

public class Rei extends PecaXadres {

	public Rei(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		return mat;
	}
}
