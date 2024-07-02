package lab01;

public class Carta {
	private int id;
	private String descricao;
	private TipoCarta tipo;
	
	public Carta(int id, String descricao, TipoCarta tipo){
		this.id = id;
		this.descricao = descricao;
		this.setTipo(tipo);
	}
	
	//Getters & Setters
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
	
	//Métodos
	public void executarAcao(Jogador jogador) {
		
	}

	public TipoCarta getTipo() {
		return tipo;
	}

	public void setTipo(TipoCarta tipo) {
		this.tipo = tipo;
	}
}