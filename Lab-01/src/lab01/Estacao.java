package lab01;

public class Estacao extends Propriedade{
		
	public Estacao(int id, String descricao, Jogador dono) {
		super(id, descricao, dono);
	}
	
	public Estacao(int id, String descricao, Jogador dono, String nome, int preco, float aluguel) {
		super(id, descricao, dono, nome, preco, aluguel);
	}

	public int calcularAluguel() {
		int al = Math.round(getAluguel());
		return al;
	}
}