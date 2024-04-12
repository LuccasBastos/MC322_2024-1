package lab01;
import java.util.ArrayList;

public class Tabuleiro {
	ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	ArrayList<String> propriedades = new ArrayList<String>(); 
	Jogador Player = new Jogador();
	String Prop;
	int i, j, k, l = 0;
	
	public boolean addJogador(int njog) {
		for(i=0; i<njog; i++){
			jogadores.add(Player);
			if (jogadores.contains(Player)){
				return true;
			} 
		}
		return false;
	}
	
	public boolean removeJogador(int njog) {
		for(j=0; j<njog; j++){
			jogadores.remove(Player);
			if (jogadores.contains(Player)) {
				return false;
			}
		}
		return false;
	} 
	
	public boolean addPropriedade(int nprop) {
		for(k=0; k<nprop; k++){
			propriedades.remove(Prop);
			if (propriedades.contains(Prop)) {
				return false;
			}
		}
		return false;
	} 
	
	public boolean removePropriedade(int nprop) {
		for(l=0; l<nprop; l++){
			propriedades.remove(Prop);
			if (propriedades.contains(Prop)) {
				return false;
			}
		}
		return false;
	}
}