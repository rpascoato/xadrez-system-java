package boardgame;

public class Board {
	
	private int fileiras;
	private int colunas;
	private Peca[][] pecas;
	
	public Board(int fileiras, int colunas) {
		if (fileiras <1 || colunas < 1) {
			throw new BoardExcecao("Erro criando tabuleiro: é necessario que haja pelo menos uma linha e uma coluna");
		}
		this.fileiras = fileiras;
		this.colunas = colunas;
		pecas = new Peca[fileiras][colunas];
	}

	public int getFileiras() {
		return fileiras;
	}

	public int getColunas() {
		return colunas;
	}
	
	public Peca peca (int fileira, int coluna) {
		if (!posicaoExiste(fileira, coluna)) {
			throw new BoardExcecao("Posição não está no tabuleiro");
		}
		return pecas [fileira][coluna];		
	}
	
	public Peca peca(Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new BoardExcecao("Posição não está no tabuleiro");
		}
		return pecas[posicao.getFileira()][posicao.getColuna()];
	}
	
	public void pecaLugar (Peca peca, Posicao posicao) {
		if (haUmaPeca(posicao)) {
			throw new BoardExcecao("Já existe uma peça nessa posição " + posicao);
		}
		pecas[posicao.getFileira()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoExiste (int fileira, int coluna) {
		return fileira >= 0 && fileira < fileiras && coluna >= 0 && coluna < colunas;
	}
	
	public  boolean posicaoExiste (Posicao posicao) {
		return posicaoExiste(posicao.getFileira(), posicao.getColuna());
	}
	
	public boolean haUmaPeca (Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new BoardExcecao("Posição não está no tabuleiro");
		}
		return peca(posicao) != null;
	}
}
