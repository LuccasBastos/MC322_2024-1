package lab01;

public class Propriedade extends Carta {
	private String nome;
	private int preco;
	private float aluguel;
	private Jogador dono;

	public Propriedade (int id, String descricao, TipoCarta tipo, Jogador dono) {
		super(id, descricao, tipo);
	}
	
	public Propriedade (int id, String descricao, TipoCarta tipo, Jogador dono, float aluguel) {
		super(id, descricao, tipo);
		this.aluguel = aluguel;
	}
	
	public Propriedade(int id, String descricao, TipoCarta tipo, Jogador dono, int preco, float aluguel) {
		super(id, descricao, tipo);
		this.preco = preco;
		this.aluguel = aluguel;
		this.dono = dono;
	}

	//Getters & Setters
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
	
	public Jogador getDono() {
		return dono;
	}

	public void setDono(Jogador dono) {
		this.dono = dono;
	}
	
	//Métodos
	public int calcularAluguel() {
		int al = Math.round(aluguel);
		return al;
	}
}