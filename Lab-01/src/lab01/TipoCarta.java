package lab01;
public enum TipoCarta {
	SORTE(1),
	REVES(2);
	
	private int code;
	
	TipoCarta(int code){
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
}