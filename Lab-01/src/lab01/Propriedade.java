package lab01;

public class Propriedade {
	private int id;
	private String nome;
	private String proprietario;
	private int preco;
	private float aluguel;
	
	
	public Propriedade(String nome, String proprietario) {
		this.id = 0;
		this.nome = "";
		this.proprietario = "";
		this.preco = 0;
		this.aluguel = 0;
	}
	
	public Propriedade(int id, String nome, String proprietario, int preco, float aluguel) {
		this.id = id;
		this.nome = nome;
		this.proprietario = proprietario;
		this.preco = preco;
		this.aluguel = aluguel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
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