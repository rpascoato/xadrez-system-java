package xadrez;

import boardgame.Posicao;

public class XadrezPosicao {
	
	private char coluna;
	private int fileira;
	
	public XadrezPosicao(char coluna, int fileira) {
		if(coluna < 'a' || coluna > 'h' || fileira < 1 || fileira > 8) {
			throw new XadrezExcecao("Erro ao instanciar XadrezPosicao. Valores validos são de a1 à h8");
		}
		this.coluna = coluna;
		this.fileira = fileira;
	}

	public char getColuna() {
		return coluna;
	}

	public int getFileira() {
		return fileira;
	}
	
	protected Posicao toPosicao() {
		return new Posicao (8 - fileira, coluna - 'a' );
	}
	
	protected static XadrezPosicao daPosicao (Posicao posicao) {
		return new XadrezPosicao((char)('a' - posicao.getColuna()), 9 - posicao.getFileira());
	}
	
	@Override
	public String toString() {
		return "" + coluna + fileira;
	}
}
