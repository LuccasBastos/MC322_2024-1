package lab01;

public class Terreno extends Propriedade{
	private int numeroCasas;
	private int valorCasa;
	private int valorHotel;
	private boolean hotel;
	
	public Terreno(int id, String descricao, Jogador dono) {
		super(id, descricao, dono);
	}
	
	public Terreno(int id, String descricao, Jogador dono, String nome, int preco, float aluguel) {
		super(id, descricao, dono, nome, preco, aluguel);
	}

	public Terreno(int id, String descricao, Jogador dono, int numeroCasas, int valorCasa, int valorHotel, boolean hotel) {
		super(id, descricao, dono);
		this.numeroCasas = numeroCasas;
		this.valorCasa = valorCasa;
		this.valorHotel = valorHotel;
		this.hotel = hotel;
	}

	public int getNumeroCasas() {
		return numeroCasas;
	}

	public void setNumeroCasas(int numeroCasas) {
		this.numeroCasas = numeroCasas;
	}

	public int getValorCasa() {
		return valorCasa;
	}

	public void setValorCasa(int valorCasa) {
		this.valorCasa = valorCasa;
	}

	public int getValorHotel() {
		return valorHotel;
	}

	public void setValorHotel(int valorHotel) {
		this.valorHotel = valorHotel;
	}

	public boolean isHotel() {
		return hotel;
	}

	public void setHotel(boolean hotel) {
		this.hotel = hotel;
	}
	
	public int calcularAluguel(){
		int al = Math.round(getAluguel());
		return al;
	}
	
	public boolean comprarCasa(){
		if(numeroCasas > 0 && numeroCasas < 4){
			return true;
		}
		return false;
	}
	
	public boolean comprarHotel(){
		if(numeroCasas >= 4){
			return true;
		}
		return false;
	}
}