/*
 * Modificações realizadas - Lab2
 */
package lab01;

public class CartaSorte {
	private int id;
	private String descricao;
	private int movimento;
	private int efeito;
	private float valor;
	private String acao;
	private int tempo;
	private int restricao;
	
	//Construtor
	public CartaSorte (String acao) {
		this.acao = acao;
	}
		
	public CartaSorte(int id, String descricao, int movimento, int efeito, float valor, String acao, int tempo,	int restricao) {
		this.id = id;
		this.descricao = descricao;
		this.movimento = movimento;
		this.efeito = efeito;
		this.valor = valor;
		this.acao = acao;
		this.tempo = tempo;
		this.restricao = restricao;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getMovimento() {
		return movimento;
	}

	public void setMovimento(int movimento) {
		this.movimento = movimento;
	}

	public int getEfeito() {
		return efeito;
	}

	public void setEfeito(int efeito) {
		this.efeito = efeito;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public int getRestricao() {
		return restricao;
	}

	public void setRestricao(int restricao) {
		this.restricao = restricao;
	}
	
	
}
