package lab01;

public class Jogador extends Biblioteca {
	private int id = 0;
	private int dinheiro;
	private String nome;
	private String cpf;
	private String email;
	private String foto;
	
	//Construtores
	public Jogador () {
		this.nome = "";
		this.cpf = "";
		this.email = "";
		this.foto = "";
		this.id	= id++;
		this.dinheiro = 2458;
	}
	
	public Jogador (String nome, String cpf, String email, String foto, int id, int dinheiro) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.foto = foto;
		this.id	= id++;
		this.dinheiro = 2458;
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(int dinheiro) {
		this.dinheiro = dinheiro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	@Override
	public String toString() {
		return "Jogador [id=" + id + ", dinheiro=" + dinheiro + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email
				+ ", foto=" + foto + ", getId()=" + getId() + ", getDinheiro()=" + getDinheiro() + ", getNome()="
				+ getNome() + ", getCpf()=" + getCpf() + ", getEmail()=" + getEmail() + ", getFoto()=" + getFoto()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}