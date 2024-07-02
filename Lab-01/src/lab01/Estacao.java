package lab01;

public class Estacao extends Propriedade{
	public int tarifa;
		
	//Construtores
	public Estacao(int id, String descricao, TipoCarta tipo, Jogador dono) {
		super(id, descricao, tipo, dono);
	}
	
	public Estacao(int id, String descricao, TipoCarta tipo, Jogador dono, int preco, float aluguel) {
		super(id, descricao, tipo, dono, preco, aluguel);
	}
	
	//Getters & Setters
	public int getTarifa() {
		return tarifa;
	}

	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	
	//Métodos
	public int calcularAluguel() {
		int al = Math.round(getAluguel())*getTarifa();
		return al;
	}
}