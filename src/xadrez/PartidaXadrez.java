package xadrez;

import boardgame.Board;
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
	
	private void lugarNovoPeca(char coluna, int fileira, PecaXadrez peca) {
		board.pecaLugar(peca, new XadrezPosicao(coluna, fileira).toPosicao());
	}
	
	private void inicioSetup() {
		lugarNovoPeca('b', 6, new Torre(board, Cor.WHITE));
		lugarNovoPeca('c', 1, new Torre(board, Cor.WHITE));
		lugarNovoPeca('c', 2, new Torre(board, Cor.WHITE));
		lugarNovoPeca('d', 2, new Torre(board, Cor.WHITE));
		lugarNovoPeca('e', 2, new Torre(board, Cor.WHITE));
		lugarNovoPeca('e', 1, new Torre(board, Cor.WHITE));
		lugarNovoPeca('d', 1, new Rei(board, Cor.WHITE));

		lugarNovoPeca('c', 7, new Torre(board, Cor.BLACK));
		lugarNovoPeca('c', 8, new Torre(board, Cor.BLACK));
		lugarNovoPeca('d', 7, new Torre(board, Cor.BLACK));
		lugarNovoPeca('e', 7, new Torre(board, Cor.BLACK));
		lugarNovoPeca('e', 8, new Torre(board, Cor.BLACK));
		lugarNovoPeca('d', 8, new Rei(board, Cor.BLACK));
	}

}
