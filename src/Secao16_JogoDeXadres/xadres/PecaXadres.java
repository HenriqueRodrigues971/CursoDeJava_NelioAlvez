package Secao16_JogoDeXadres.xadres;

import Secao16_JogoDeXadres.boardgame.Peca;
import Secao16_JogoDeXadres.boardgame.Tabuleiro;

public abstract class PecaXadres extends Peca {

	private Color color;

	public PecaXadres(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
