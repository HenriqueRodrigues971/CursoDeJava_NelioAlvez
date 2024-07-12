package Secao16_JogoDeXadres.xadres;

import Secao16_JogoDeXadres.boardgame.Peca;
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

	public PecaXadres performaXadresMovimento(XadresPosicao posicaoOrigem, XadresPosicao posicaoDestino) {
		Position origem = posicaoOrigem.toPosition();
		Position destino = posicaoDestino.toPosition();
		validarPosicaoDeOrigem(origem);
		Peca pecaCapturada = movimentarPeca(origem, destino);
		return (PecaXadres) pecaCapturada;
	}

	private Peca movimentarPeca(Position origem, Position destino) {
		Peca p = tabuleiro.removerPeca(origem);
		Peca pecaCapturada = tabuleiro.removerPeca(destino);
		tabuleiro.posicionarPeca(p, destino);
		return pecaCapturada;
	}

	private void validarPosicaoDeOrigem(Position position) {
		if (!tabuleiro.temUmaPeca(position)) {
			throw new XadrezException("Não existe peça na posição de origem.");
		}
		if (!tabuleiro.peca(position).existePossiveisMovimentos()) {
			throw new XadrezException("Não existe movimentos possiveis para a peça escolhida");
		}
	}

	private void novaPosicaoPeca(char coluna, int linha, PecaXadres peca) {
		tabuleiro.posicionarPeca(peca, new XadresPosicao(coluna, linha).toPosition());
	}

	private void iniciarSetup() {
		novaPosicaoPeca('c', 2, new Torre(tabuleiro, Color.WHITE));
		novaPosicaoPeca('c', 1, new Torre(tabuleiro, Color.WHITE));
		novaPosicaoPeca('d', 2, new Torre(tabuleiro, Color.WHITE));
		novaPosicaoPeca('e', 2, new Torre(tabuleiro, Color.WHITE));
		novaPosicaoPeca('e', 1, new Torre(tabuleiro, Color.WHITE));
		novaPosicaoPeca('d', 1, new Rei(tabuleiro, Color.WHITE));

		novaPosicaoPeca('c', 7, new Torre(tabuleiro, Color.BLACK));
		novaPosicaoPeca('c', 8, new Torre(tabuleiro, Color.BLACK));
		novaPosicaoPeca('d', 7, new Torre(tabuleiro, Color.BLACK));
		novaPosicaoPeca('e', 7, new Torre(tabuleiro, Color.BLACK));
		novaPosicaoPeca('e', 8, new Torre(tabuleiro, Color.BLACK));
		novaPosicaoPeca('d', 8, new Rei(tabuleiro, Color.BLACK));

	}
}
