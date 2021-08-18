package xadrez;

import boardgame.Board;

public class PartidaXadrez {
	
	private Board board;
	
	public PartidaXadrez() {
		board = new Board(8, 8);
	}
	
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] mat = new PecaXadrez[board.getFileiras()][board.getColunas()];
		for (int i=0; i<board.getFileiras(); i++) {
			for (int j=0; j<board.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) board.peca(i, j);
			}
		}
		return mat;
	}

}
