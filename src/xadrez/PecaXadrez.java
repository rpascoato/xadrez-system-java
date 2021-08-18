package xadrez;

import boardgame.Board;
import boardgame.Peca;

public class PecaXadrez extends Peca {
	
	private Cor cor;

	public PecaXadrez(Board board, Cor cor) {
		super(board);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

}
