package xadrez.peças;

import boardgame.Board;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez {

	public Rei(Board board, Cor cor) {
		super(board, cor);
	}

	@Override
	public String toString() {
		return "R";
	}
}
