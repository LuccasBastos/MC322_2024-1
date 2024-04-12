package lab01;

public class Estacao extends Propriedade{
	
	public Estacao(String nome, String proprietario) {
		super(nome, proprietario);
	}
	
	public int calcularAluguel() {
		int al = Math.round(getAluguel());
		return al;
	}
}