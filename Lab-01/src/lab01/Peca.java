package lab01;

public class Peca {
	private String cor;
	private int posicao;
	private Jogador dono;

	//Construtor
	public Peca (String cor) {
		this.cor = cor;
	}
	
	public Peca (String cor, int posicao, Jogador dono) {
		this.cor = cor;
		this.posicao = 0;
		this.setDono(dono);
	}

	//Getters & Setters
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

	public Jogador getDono() {
		return dono;
	}

	public void setDono(Jogador dono) {
		this.dono = dono;
	}
}