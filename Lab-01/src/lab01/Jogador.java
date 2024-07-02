package lab01;
import java.util.ArrayList;

public class Jogador extends Biblioteca {
	private int id;
	private int dinheiro;
	private String nome;
	private String cpf;
	private String email;
	ArrayList<Carta> cartas = new ArrayList<Carta>();
	private Peca peca;
	
	//Construtores
	public Jogador (String nome) {
		this.nome = "";
		this.cpf = "";
		this.email = "";
		this.id	= getId();
		this.dinheiro = 0;
		this.peca = new Peca("");
	}
	
	public Jogador (String nome, String cpf, String email, int id, int dinheiro, Peca peca) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.id	= getId();
		this.dinheiro = 0;
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
		
	//ToString @Override
	public String toString() {
		return "Dados do jogador " + nome + ":\n" + " >>> Identificação: " + id + "\n >>> CPF: " + cpf + "\n >>> E-mail: " + email
				+ "\n >>> Dinheiro atual: R$" + dinheiro + "\n" + "Cor da peça: " + getPeca().getCor();
	}

}