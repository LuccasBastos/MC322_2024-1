package lab01;
import java.util.ArrayList;

public class Tabuleiro {
	String Prop, nome, cor;
	ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	ArrayList<Propriedade> propriedades = new ArrayList<Propriedade>(); 
	int i, j, k, l = 0;
	
	public boolean addJogador(int njog){
		for(i=0; i<njog; i++){
			jogadores.add(new Jogador(nome));
		}
		return true;
	}
	
	public boolean removeJogador(int njog){
		for(j=0; j<njog; j++){
			jogadores.remove(njog);
		}
		return true;
	} 
	
	public boolean addPropriedade(int nprop){
		for(k=0; k<nprop; k++){
			propriedades.add(new Propriedade(0, null, null));
		}
		return true;
	} 
	
	public boolean removePropriedade(int nprop){
		for(l=0; l<nprop; l++){
			propriedades.remove(nprop);
		}
		return true;
	}
}