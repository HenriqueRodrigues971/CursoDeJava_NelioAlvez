package Secao16_JogoDeXadres.xadres.pecas;

import Secao16_JogoDeXadres.boardgame.Tabuleiro;
import Secao16_JogoDeXadres.xadres.Color;
import Secao16_JogoDeXadres.xadres.PecaXadres;

public class Torre extends PecaXadres {

	public Torre(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
	}
   @Override
   public String toString() {
	   return "T";
   }
}
