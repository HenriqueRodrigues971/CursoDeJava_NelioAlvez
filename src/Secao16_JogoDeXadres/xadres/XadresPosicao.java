package Secao16_JogoDeXadres.xadres;

import Secao16_JogoDeXadres.boardgame.Position;

public class XadresPosicao {
	private char coluna;
	private int linha;

	public XadresPosicao(char coluna, int linha) {
		if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new XadrezException("Erro instanciando XadresPosicao: Valores validos são de a1 até h8");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	protected Position toPosition() {
		return new Position(8 - linha, coluna - 'a');
	}

	protected static XadresPosicao paraPosicao(Position position) {
		return new XadresPosicao((char) ('a' - position.getColuna()), 8 - position.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}
}
