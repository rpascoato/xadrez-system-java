package boardgame;

public class Board {
	
	private int fileiras;
	private int colunas;
	private Peca[][] pecas;
	
	public Board(int fileiras, int colunas) {
		this.fileiras = fileiras;
		this.colunas = colunas;
		pecas = new Peca[fileiras][colunas];
	}

	public int getFileiras() {
		return fileiras;
	}

	public void setFileiras(int fileiras) {
		this.fileiras = fileiras;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
		
}
