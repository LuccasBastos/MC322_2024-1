package lab01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		int millis = 1000;
		Scanner teclado = new Scanner(System.in);
		Tabuleiro Tab = new Tabuleiro(); 
		Tab.addPropriedade(28);
			
		System.out.println("Seja bem vindo ao Monopoly!"); 
		Thread.sleep(millis);
		
		System.out.println("Quantos jogadores terão na partida?");
		String NumdeJogadores = teclado.nextLine();
		int Num_Jogadores = Integer.parseInt(NumdeJogadores);
		
		/*
		 * Inicia a fase cadastral dos jogadores, sendo necessários todos os dados implementados na classe Jogador
		 */
		
		if (Num_Jogadores > 6 || Num_Jogadores < 2) {
			System.out.println("Número de jogadores inválido, o Monopoly pode ser jogado de 2 a 6 jogadores");
		} else {
			Tab.addJogador(Num_Jogadores);
			List<String> Cores_disp = new ArrayList<>(Arrays.asList("Vermelho", "Azul", "Verde", "Amarelo", "Roxo", "Laranja"));
			
			for (int i = 0; i < Num_Jogadores; i++) {
				int j = i + 1;
				System.out.println("Digite o nome do Jogador " + j + ":");  
				String Nome_usuario = teclado.nextLine();
				Tab.jogadores.get(i).setNome(Nome_usuario);
						
				Boolean resp = false, Email = false;
				while (resp == false) {
					System.out.println("Certo " + Tab.jogadores.get(i).getNome() + ", agora digite seu CPF: ");
					String CPF_digitado = teclado.nextLine();
					Tab.jogadores.get(i).setCpf(CPF_digitado);
					resp = Tab.jogadores.get(i).validarCPF(CPF_digitado);
				}
				
				System.out.println("Seu CPF está sendo analisado, só um instante.");
				Thread.sleep(millis);
				System.out.println(">>> CPF validado <<< \n"); 
							
				while (Email == false) {
					System.out.println("Digite seu e-mail: ");			
					String email_digitado = teclado.nextLine();
					Tab.jogadores.get(i).setEmail(email_digitado);
					Email = Tab.jogadores.get(i).validarEmail(email_digitado); 
				}
				
				System.out.println("Seu Email está sendo analisado, só um instante.");
				Thread.sleep(millis);
				System.out.println(">>> Email validado <<< \n"); 

				System.out.println("Insira o link de sua foto: "); 
				String foto_inserida = teclado.nextLine();
				Tab.jogadores.get(i).setFoto(foto_inserida);
				Thread.sleep(millis);
								
				Peca peca = Tab.jogadores.get(i).getPeca();
				System.out.println("\nEscolha o número referente a cor da sua Peça:");
				for (int k = 0; k < Cores_disp.size(); k++) {
					System.out.println((k + 1) + ". " + Cores_disp.get(k));
					}
				int escolha = teclado.nextInt();
				teclado.nextLine();
				if (escolha >= 1 && escolha <= Cores_disp.size()) {
					String Cor_selec = Cores_disp.remove(escolha - 1);
					peca.setCor(Cor_selec);
					/*if (peca != null) {
					 * peca.setCor(Cor_selecionada);
					 * peca.setPosicao(0);
					 * }*/
					} 
				
				if(i != Num_Jogadores - 1) {
					Thread.sleep(millis/2);
					System.out.println("\nPróximo jogador a ser cadastrado!\n");
					Thread.sleep(millis/2);
				}
			}
		}
		Thread.sleep(millis);
		System.out.println("\nCadastros finalizados!\n");
		Thread.sleep(millis);
		
		/*  
		 * Preciso descobrir como reordenar a lista de jogadores no Tabuleiro pra ficar na ordem dos dados. Além disso, identificar se houve empate nos dados, possibilitar que aqueles
		 * jogadores joguem novamente
		 * 
		 * Talvez uma opção seja tornar o lançamento do dado individual por jogador > Chama o jogador e ele "aciona" o dado
		 */
		System.out.println("Realizaremos a ordem dos jogadores. Quem tirar o valor mais alto no dado inicia e assim por diante. Em caso de empate, jogue os dados novamente.");
		Thread.sleep(millis);
		ArrayList<Integer> ordem = new ArrayList<Integer>();
		//char opcao = 's';
		//while (opcao == 's') {
			//ordem.removeAll(ordem);
			for (int a = 0; a < Num_Jogadores; a++) {
				int pos = 0;
				//System.out.println(Tab.jogadores.get(a).getNome() + " lançou os dados e tirou " + (pos = Biblioteca.lancarDados()));
				Thread.sleep(millis);
				Tab.jogadores.get(a).setId(pos);
				ordem.add(pos);
			}
		//System.out.println("Teve empate entre os jogadores?");
		//opcao = teclado.next().charAt(0);
		//}
			
		Thread.sleep(millis);
		System.out.println("\n\t >>> QUE COMECEM OS JOGOS!! <<< \n\t");
		
		/*
		 * Inicia uma nova rodada. 
		 * Para que um rodada nova comece, precisa ser feito um novo loop para que rode o for interno. (é o for que está comentado)
		 * Quando determinada jogador estiver superar a posição 40, deve retornar ao valor 0 e continuar a contagem (loop de 0 -> 40 -> 0).
		 * Acrescentar o que precisa ser realizado pelo jogador conforme a casa que caiu.
		 */
		//for(int k = 0; k < 2; k++) { 
			for(int j = 0; j < Num_Jogadores; j++) {
				//int i = j+1;
				Peca peca = Tab.jogadores.get(j).getPeca();
				int ld = Biblioteca.lancarDados();
				peca.setPosicao(ld + peca.getPosicao());
				//System.out.println("Jog" + i + " " + peca.getPosicao() + " --- " + ld);
				
				switch (peca.getPosicao()){
					case 1:
						System.out.println("Casa iniciar");
						break;
					case 2:
						System.out.println("Av. Nove de Julho");
						break;
					case 3:
						System.out.println("Av. Brasil");
						break;
					case 4:
						System.out.println("RU");
						break;
					case 5:
						System.out.println("Av. Beira Mar");
						break;
					case 6:
						System.out.println("Av. Rio Branco");
						break;
					case 7:
						System.out.println("Sorte/Reves");
						break;
					case 8:
						System.out.println("Av. do Estado");
						break;
					case 9:
						System.out.println("IFCH");
						break;
					case 10:
						System.out.println("Av. do Contorno");
						break;
					case 11:
						System.out.println("Prisao");
						break;
					case 12:
						System.out.println("Sorte/Reves");
						break;
					case 13:
						System.out.println("Av. Reboucas");
						break;
					case 14:
						System.out.println("Av. Santo Amaro");
						break;
					case 15:
						System.out.println("CB");
						break;
					case 16:
						System.out.println("Rua da Consolacao");
						break;
					case 17:
						System.out.println("Lucro/Dividendos");
						break;
					case 18:
						System.out.println("Av. Morumbi");
						break;
					case 19:
						System.out.println("Av. Higienopolis");
						break;
					case 20:
						System.out.println("Av. Sao Joao");
						break;
					case 21:
						System.out.println("Parada Livre - Ferias");
						break;
					case 22:
						System.out.println("Av. Ipiranga");
						break;
					case 23:
						System.out.println("FEF");
						break;
					case 24:
						System.out.println("Impostos de Renda");
						break;
					case 25:
						System.out.println("Sorte/Reves");
						break;
					case 26:
						System.out.println("Rua Brigadeiro Faria Lima");
						break;
					case 27:
						System.out.println("Av. Paulista");
						break;
					case 28:
						System.out.println("Sorte/Reves");
						break;
					case 29:
						System.out.println("Av. Recife");
						break;
					case 30:
						System.out.println("IC");
						break;
					case 31:
						System.out.println("Va para a prisao");
						break;
					case 32:
						System.out.println("Av. JK");
						break;
					case 33:
						System.out.println("Sorte/Reves");
						break;
					case 34:
						System.out.println("Rua Oscar Freire");
						break;
					case 35:
						System.out.println("Av. Ibirapuera");
						break;
					case 36:
						System.out.println("Av. Vieira Souto");
						break;
					case 37:
						System.out.println("Praca da Paz");
						break;
					case 38:
						System.out.println("Av. Presidente Vargas");
						break;
					case 39:
						System.out.println("Sorte/Reves");
						break;
					case 40:
						System.out.println("Av. Niemeyer");
						break;
				}
			}
		//}
	}
}