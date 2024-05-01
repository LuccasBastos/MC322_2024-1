package lab01;
import java.util.ArrayList;

public class Jogador extends Biblioteca {
	private int id = 0;
	private int dinheiro;
	private String nome;
	private String cpf;
	private String email;
	private String foto;
	ArrayList<Carta> cartas = new ArrayList<Carta>();
	private Peca peca;
	
	//Construtores
	public Jogador (String nome) {
		this.nome = "";
		this.cpf = "";
		this.email = "";
		this.foto = "";
		this.id	= getId();
		this.dinheiro = 2458;
		this.peca = new Peca("");
	}
	
	public Jogador (String nome, String cpf, String email, String foto, int id, int dinheiro, Peca peca) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.foto = foto;
		this.id	= getId();
		this.dinheiro = 2458;
		this.peca = peca;
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
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public Peca getPeca() {
		return peca;
	}
	
	public void setPeca(Peca peca) {
		this.peca = peca;
	}
		
	@Override
	public String toString() {
		return "Dados do jogador " + nome + ":\n" + " >>> Identificação: " + id + "\n >>> CPF: " + cpf + "\n >>> E-mail: " + email
				+ "\n >>> Foto: " + foto + "\n >>> Dinheiro atual: R$" + dinheiro + "\n" + "Cor da peça: " + getPeca().getCor();
	}

}