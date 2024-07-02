package lab01;

public class CartaSorte extends Carta {
	private int movimento; 
	private int efeito; 
	private float valor;
	private String acao; 
	private int tempo; 
	private String restricao; 
	
	//Construtor
	public CartaSorte(int id, String descricao, TipoCarta tipo, String acao) {		
		super(id, descricao, tipo);
		this.acao = acao;
	}
		
	public CartaSorte(int id, String descricao, TipoCarta tipo, int movimento, int efeito, float valor, String acao, int tempo, String restricao) {
		super(id, descricao, tipo);
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

	public String getRestricao() {
		return restricao;
	}

	public void setRestricao(String restricao) {
		this.restricao = restricao;
	}	
	
	//Métodos
	public int executaAcao (int dinheiro) {
		int dinheiroAt = dinheiro - Math.round(getValor());
		return dinheiroAt;
	}
}