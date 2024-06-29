package Secao16_JogoDeXadres.boardgame;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;

	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new BoardException("Erro na criação do tabuleiro: é necessario que haja uma linha e uma coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linha, int coluna) {
		if (!posicaoExiste(linha, coluna)) {
			throw new BoardException("Não tem posição no tabuleiro");
		}

		return pecas[linha][coluna];
	}

	public Peca peca(Position position) {
		if (!posicaoExiste(position)) {
			throw new BoardException("Não tem posição no tabuleiro");
		}
		return pecas[position.getLinha()][position.getColuna()];
	}

	public void posicionarPeca(Peca peca, Position position) {
		if (temUmaPeca(position)) {
			throw new BoardException("Já existe uma peça na posição: " + position);
		}
		pecas[position.getLinha()][position.getColuna()] = peca;
		peca.position = position;
	}

	private boolean posicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}

	public boolean posicaoExiste(Position position) {
		return posicaoExiste(position.getLinha(), position.getColuna());
	}

	public boolean temUmaPeca(Position position) {
		if (!posicaoExiste(position)) {
			throw new BoardException("Não tem posição no tabuleiro");
		}
		return peca(position) != null;
	}
}
