package lab01;

public class ServicoPublico extends Propriedade{
	
	public ServicoPublico(int id, String descricao, Jogador dono, String nome, int preco, float aluguel) {
		super(id, descricao, dono, nome, preco, aluguel);
	}
	
	public int calcularAluguel(int dados) {
		int al = Math.round(getAluguel());
		return al;
	}
}