package lab01;

public class Peça {
	private String cor;
	private int posicao;

	//Construtor
	public Peça (String cor, int posicao) {
		this.cor = cor;
		this.posicao = posicao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
}
