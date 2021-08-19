package xadrez;

import boardgame.Board;
import boardgame.Posicao;
import xadrez.peças.Rei;
import xadrez.peças.Torre;

public class PartidaXadrez {
	
	private Board board;
	
	public PartidaXadrez() {
		board = new Board(8, 8);
		inicioSetup();
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
	
	private void inicioSetup() {
		board.pecaLugar(new Torre(board, Cor.WHITE), new Posicao(2, 1));
		board.pecaLugar(new Rei(board, Cor.BLACK), new Posicao(0, 4));
		board.pecaLugar(new Rei(board, Cor.WHITE), new Posicao(7, 4));
	}

}
