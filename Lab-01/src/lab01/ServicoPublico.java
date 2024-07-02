package lab01;

public class ServicoPublico extends Propriedade{
	public int multiplicador;

	//Construtores
	public ServicoPublico(int id, String descricao, TipoCarta tipo,Jogador dono, int preco, float aluguel, int multiplicador) {
		super(id, descricao, tipo, dono, preco, aluguel);
	}
	
	public ServicoPublico(int id, String descricao, TipoCarta tipo, Jogador dono, int preco, float aluguel) {
		super(id, descricao, tipo, dono, preco, aluguel);
	}
		
	//Getters & Setters
	public int getMultiplicador() {
		return multiplicador;
	}

	public void setMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}
	
	//Métodos
	public int calcularAluguel() {
		int al = Math.round(getAluguel())*getMultiplicador();
		return al;
	}
}