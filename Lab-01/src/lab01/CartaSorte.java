package lab01;

public class CartaSorte extends Carta {
	private int movimento; 
	private int efeito; 
	private float valor;
	private String acao; 
	private int tempo; 
	private int restricao; 
	
	//Construtor
	public CartaSorte(int id, String descricao, Jogador dono, String acao) {		
		super(id, descricao, dono);
		this.acao = acao;
	}
		
	public CartaSorte(int id, String descricao, Jogador dono, int movimento, int efeito, float valor, String acao, int tempo, int restricao) {
		super(id, descricao, dono);
		this.movimento = movimento;
		this.efeito = efeito;
		this.valor = valor;
		this.acao = acao;
		this.tempo = tempo;
		this.restricao = restricao;
	}

	//Getters and Setters
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