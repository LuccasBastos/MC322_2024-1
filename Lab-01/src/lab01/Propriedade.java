package lab01;

public class Propriedade extends Carta {
	private String nome;
	private int preco;
	private float aluguel;

	public Propriedade (int id, String descricao, Jogador dono) {
		super(id, descricao, dono);
	}
	
	public Propriedade(int id, String descricao, Jogador dono, String nome, int preco, float aluguel) {
		super(id, descricao, dono);
		this.nome = nome;
		this.preco = preco;
		this.aluguel = aluguel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public float getAluguel() {
		return aluguel;
	}

	public void setAluguel(float aluguel) {
		this.aluguel = aluguel;
	}
	
	public int calcularAluguel() {
		int al = Math.round(aluguel);
		return al;
	}
}