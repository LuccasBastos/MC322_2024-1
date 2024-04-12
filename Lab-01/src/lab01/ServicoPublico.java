package lab01;

public class ServicoPublico extends Propriedade{
	
	public ServicoPublico(String nome, String proprietario) {
		super(nome, proprietario);
	}
	
	public int calcularAluguel(int dados) {
		int al = Math.round(getAluguel());
		return al;
	}
}