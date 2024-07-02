package lab01;

public class Terreno extends Propriedade{
	private int numeroCasas;
	private int valorCasa;
	private int valorHotel;
	private boolean hotel;
	
	//Construtores
	public Terreno(int id, String descricao, TipoCarta tipo, Jogador dono) {
		super(id, descricao, tipo, dono);
	}

	public Terreno(int id, String descricao, TipoCarta tipo, Jogador dono, int preco, float aluguel, int valorCasa, int valorHotel) {
		super(id, descricao, tipo, dono, preco, aluguel);
		this.valorCasa = valorCasa;
		this.valorHotel = valorHotel;
	}

	public Terreno(int id, String descricao, TipoCarta tipo, Jogador dono, int numeroCasas, int valorCasa, int valorHotel, boolean hotel) {
		super(id, descricao, tipo, dono);
		this.numeroCasas = numeroCasas;
		this.valorCasa = valorCasa;
		this.valorHotel = valorHotel;
		this.hotel = hotel;
	}

	//Getters & Setters
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
	
	//Métodos
	public int calcularAluguel(){
		int al = Math.round(getAluguel());
		return al;
	}
	
	public boolean comprarCasa(){
		numeroCasas = numeroCasas + 1;
		if(numeroCasas > 0 && numeroCasas < 4){
			return true;
		}
		return false;
	}
	
	public boolean comprarHotel(){
		numeroCasas = numeroCasas + 1;
		if(numeroCasas >= 4){
			return true;
		}
		return false;
	}
}