package lab01;

public class Carta {
	private int id;
	private String descricao;
	private Jogador dono;
	
	public Carta(int id, String descricao, Jogador dono){
		this.id = id;
		this.descricao = descricao;
		this.dono = dono;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public Jogador getDono(){
		return dono;
	}
}