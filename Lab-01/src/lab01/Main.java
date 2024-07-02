package lab01;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException, IOException {
		int millis = 1000;
		boolean sobrescrita = false;
		Scanner teclado = new Scanner(System.in);
		BufferedWriter escritor = new BufferedWriter(new FileWriter("descricaoJogadas.txt", sobrescrita));
		Tabuleiro Tab = new Tabuleiro(); 
		
		System.out.println("Seja bem vindo ao Monopoly!"); 
		Thread.sleep(millis);
		
		System.out.println("Quantos jogadores terão na partida?");
		String NumdeJogadores = teclado.nextLine();
		int Num_Jogadores = Integer.parseInt(NumdeJogadores);
		
		escritor.write("O jogo inicia com "+ Num_Jogadores + " jogadores\n");
		
		/*
		 * Inicia a fase cadastral dos jogadores, sendo necessários todos os dados implementados na classe Jogador
		 */
		
		if (Num_Jogadores > 6 || Num_Jogadores < 2) {
			System.out.println("Número de jogadores inválido, o Monopoly pode ser jogado de 2 a 6 jogadores");
		} else {
			Tab.addJogador(Num_Jogadores);
			//List<String> Cores_disp = new ArrayList<>(Arrays.asList("Vermelho", "Azul", "Verde", "Amarelo", "Roxo", "Laranja"));
			
			for (int i = 0; i < Num_Jogadores; i++) {
				int j = i + 1;
				escritor.write("Jogador " + j + ":\n");
				System.out.println("Digite o nome do Jogador " + j + ":");  
				String Nome_usuario = teclado.nextLine();
				Tab.jogadores.get(i).setNome(Nome_usuario);
				Tab.jogadores.get(i).setDinheiro(2458);
				System.out.println("O saldo de " + Tab.jogadores.get(i).getNome()+ " é: "+Tab.jogadores.get(i).getDinheiro());
				
				/*Boolean resp = false, Email = false;
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
				}	
				
				escritor.write("\tNome: " + Tab.jogadores.get(i).getNome() + "\n\tCPF: " + Tab.jogadores.get(i).getCpf() + 
						"\n\tEmail: " + Tab.jogadores.get(i).getEmail() + "\n\tCor da Peça: " + Tab.jogadores.get(i).getPeca() + "\n");
						
				if(i != Num_Jogadores - 1) {
					Thread.sleep(millis/2);
					System.out.println("\nPróximo jogador a ser cadastrado!\n");
					Thread.sleep(millis/2);
				}*/
			}
		}
		
		Thread.sleep(millis);
		System.out.println("\nCadastros finalizados!\n");
		Thread.sleep(millis);
		
		/*  
		 * Os jogadores lançam os dados e verificam quem iniciará a partida. Em caso de empate em 2 ou mais jogadores, a ordem de lançamento é o fator desempate.
		 */
		System.out.println("Realizaremos a ordem dos jogadores. Quem tirar o valor mais alto no dado inicia e assim por diante. Em caso de empate, quem lançou primeiro terá preferência.");
		Thread.sleep(millis);

		for (int a = 0; a < Num_Jogadores; a++) {
			int pos;
			System.out.println(Tab.jogadores.get(a).getNome() + " lançou os dados e tirou " + (pos = Biblioteca.lancarDados()));
			Thread.sleep(millis);
			Tab.jogadores.get(a).setId(pos);
		}
		
		Collections.sort(Tab.jogadores, Comparator.comparingInt(Jogador::getId).reversed());
		Thread.sleep(millis);
		System.out.println("\nA ordem dos jogadores ficou a seguinte: ");
		escritor.write("\nA ordem dos jogadores ficou a seguinte: \n");
		
		for (int q = 0; q < Num_Jogadores; q++) {
			System.out.println((q + 1) + "ª posição " + Tab.jogadores.get(q).getNome());
			escritor.write(("\t"+Tab.jogadores.get(q).getNome() + " na " + (q + 1) + "ª posição \n"));
		}
			
		Thread.sleep(millis);
		System.out.println("\n\t >>> QUE COMECEM OS JOGOS!! <<< \n\t");
		
		/*
		 * Inicia uma nova rodada. 
		 * Para que um rodada nova comece, precisa ser feito um novo loop para que rode o for interno. (é o for que está comentado)
		 * Quando determinada jogador estiver superar a posição 40, deve retornar ao valor 0 e continuar a contagem (loop de 0 -> 40 -> 0).
		 * Acrescentar o que precisa ser realizado pelo jogador conforme a casa que caiu.
		 */
		
		Terreno Av_1 = new Terreno (1, "Av Nove de Julho", null, null, 1000, 60, 500, 500);
		/*Terreno Av_2 = new Terreno (2, "Av Brasil", null, null, 1000, 40, 500, 500);
		Terreno Av_3 = new Terreno (3, "Av Beira Mar", null, null, 1000, 20, 500, 500);
		Terreno Av_4 = new Terreno (4, "Av Rio Branco", null, null, 2400, 200, 1500, 1500);
		Terreno Av_5 = new Terreno (5, "Av do Estado", null, null, 2200, 180, 1500, 1500);
		Terreno Av_6 = new Terreno (6, "Av do Contorno", null, null, 2200, 180,1500,1500);
		Terreno Av_7 = new Terreno (7, "Av Reboucas", null, null, 2000, 160,1000,1000);
		Terreno Av_8 = new Terreno (8, "Av Santo Amaro", null, null, 2000, 140,1000,1000);
		Terreno Av_9 = new Terreno (9, "Rua Consolacao", null, null, 2000, 140,1000,1000);
		Terreno Av_10 = new Terreno (10, "Av Morumbi", null, null, 4000, 500,2000,2000);
		Terreno Av_11 = new Terreno (11, "Av Higienópolis", null, null, 3500, 350,2000,2000);
		Terreno Av_12 = new Terreno (12, "Av Sao Joao", null, null, 1200, 80,500,500);
		Terreno Av_13 = new Terreno (13, "Av Ipiranga", null, null, 1000, 60,500,500);
		Terreno Av_14 = new Terreno (14, "Rua Brigadeiro Faria Lima", null, null, 1400, 100,1000,1000);
		Terreno Av_15 = new Terreno (15, "Av Paulista", null, null, 1600, 120,1000,1000);
		Terreno Av_16 = new Terreno (16, "Av Recife", null, null, 1400, 100,1000,1000);
		Terreno Av_17 = new Terreno (17, "Av Juscelino Kubitschek", null, null, 3200, 280,2000,2000);
		Terreno Av_18 = new Terreno (18, "Rua Oscar Freire", null, null, 3000, 260,2000,2000);
		Terreno Av_19 = new Terreno (19, "Av Ibirapuera", null, null, 3000, 260,2000,2000);
		Terreno Av_20 = new Terreno (20, "Av Vieira Souto", null, null, 2800, 260,1500,1500);
		Terreno Av_21 = new Terreno (21, "Av Presidente Vargas", null, null, 2600, 220,1500,1500);
		Terreno Av_22 = new Terreno (22, "Av Niemeyer", null, null, 2600, 220,1500,1500);*/
		
		Estacao RU = new Estacao (23, "RU", null, null, 2000, 500);
		/*Estacao IFCH = new Estacao (24, "IFCH", null, null, 2000, 500);
		Estacao CB = new Estacao (25, "CB", null, null, 2000, 500);
		Estacao FEF = new Estacao (26, "FEF", null, null, 2000, 500);
		Estacao IC = new Estacao (27, "IC", null, null, 2000, 500);
		Estacao PracaPaz = new Estacao (28, "Praça da Paz", null, null, 2000, 500);*/

		
		int rod = 1;
		boolean jogo;
		for(int k = 0; k < rod; k++) {							// rodada 
			escritor.write("\nRodada nº " + (k+1) + "\n");		
			for(int j = 0; j < Num_Jogadores; j++) {			// n jogadores
				Peca peca = Tab.jogadores.get(j).getPeca();		
				System.out.println(" >>> Rodada do jogador(a): "+ Tab.jogadores.get(j).getNome() + " <<<");

				int ld = Biblioteca.lancarDados();
				RU.setTarifa(ld); //IFCH.setTarifa(ld); CB.setTarifa(ld); FEF.setTarifa(ld); IC.setTarifa(ld); PracaPaz.setTarifa(ld);
				System.out.println("Você tirou " + ld + " nos dados");
				peca.setPosicao(ld + peca.getPosicao());
								
				if(peca.getPosicao()>40) {
					int pos = peca.getPosicao() - 40;
					peca.setPosicao(pos);
					Tab.jogadores.get(j).setDinheiro(Tab.jogadores.get(j).getDinheiro() + 2000);
				}
				switch (peca.getPosicao()){
					case 1:
						System.out.println("Você caiu na casa: Iniciar"); //check
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Iniciar\n");
						break;
					case 2:
						System.out.println("Você caiu na casa: Av. Nove de Julho");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Nove de Julho\n");
						if ((Av_1.getDono()) == null){
							System.out.println("Você quer comprar essa rua? (sim/não)");
							String Op = teclado.nextLine();
							if (Op.equalsIgnoreCase("sim")) {
								System.out.println("Saldo antes da compra: "+ Tab.jogadores.get(j).getDinheiro());
								System.out.println("Valor de "+ Av_1.getNome() + " é: " + Av_1.getPreco());

								Tab.jogadores.get(j).setDinheiro(Tab.jogadores.get(j).getDinheiro() - Av_1.getPreco());
								Av_1.setDono(Tab.jogadores.get(j));
								System.out.println(Tab.jogadores.get(j).getNome() + ", seu saldo agora é: " + Tab.jogadores.get(j).getDinheiro());
							} else if (Op.equalsIgnoreCase("não")){
								break;
							} else {
					            System.out.println("Opção inválida.");
					            break;
					        }
						} else if (Av_1.getDono() == Tab.jogadores.get(j)) {
							System.out.println("Você quer adicionar uma casa? (sim/não)");
							String Op = teclado.nextLine();
							if (Op.equalsIgnoreCase("sim")) {
								if(Av_1.getNumeroCasas() < 4) {
									Tab.jogadores.get(j).setDinheiro(Tab.jogadores.get(j).getDinheiro() - Av_1.getValorCasa());
									Av_1.comprarCasa();
									System.out.println(Tab.jogadores.get(j).getNome() + " pagou aluguel para " + Av_1.getDono().getNome());
									System.out.println(Tab.jogadores.get(j).getNome() + ", seu saldo agora é: " + Tab.jogadores.get(j).getDinheiro());

								} else {
									Tab.jogadores.get(j).setDinheiro(Tab.jogadores.get(j).getDinheiro() - Av_1.getValorHotel());
									Av_1.comprarHotel();
								}
							}
							break;
						} else {
							Tab.jogadores.get(j).setDinheiro(Tab.jogadores.get(j).getDinheiro() - Math.round(Av_1.getAluguel()));
							Av_1.getDono().setDinheiro(Av_1.getDono().getDinheiro() + Math.round(Av_1.getAluguel()));
							System.out.println(Av_1.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + Av_1.getDono().getDinheiro());
							break;
						}
						break;
					case 3:
						System.out.println("Você caiu na casa: Av. Brasil");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Brasil\n");
						break;
					case 4:
						System.out.println("Você caiu na casa: RU");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: RU\n");
						if ((RU.getDono()) == null){
							System.out.println("Você quer comprar essa estação? (sim/não)");
							String Op = teclado.nextLine();
							if (Op.equalsIgnoreCase("sim")) {
								Tab.jogadores.get(j).setDinheiro(Tab.jogadores.get(j).getDinheiro() - RU.getPreco());
								RU.setDono(Tab.jogadores.get(j));
								System.out.println(Tab.jogadores.get(j).getNome() + ", seu saldo agora é: " + Tab.jogadores.get(j).getDinheiro());
							} else if (Op.equalsIgnoreCase("não")){
								break;
							} else {
					            System.out.println("Opção inválida.");
					            break;
					        }
						} else if (RU.getDono() != Tab.jogadores.get(j)) {
							int aluguel = RU.calcularAluguel();
							Tab.jogadores.get(j).setDinheiro(Tab.jogadores.get(j).getDinheiro() - aluguel);
							RU.getDono().setDinheiro(RU.getDono().getDinheiro() + aluguel);
							System.out.println(RU.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + RU.getDono().getDinheiro());
							System.out.println(Tab.jogadores.get(j).getNome() + ", seu novo saldo agora é: " + Tab.jogadores.get(j).getDinheiro());
							break;
						} else {
							break;
						}
						break;
					case 5:
						System.out.println("Você caiu na casa: Av. Beira Mar");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Beira Mar\n");
						break;
					case 6:
						System.out.println("Você caiu na casa: Av. Rio Branco");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Rio Branco\n");
						break;
					case 7:
						System.out.println("Você caiu na casa: Sorte/Reves");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Sorte/Reves\n");
						//sorteio entre sorte e reves
						// sorteio entre as opções que tem
						// aplica a ação com o jogador que manda em determinada carta
						break;
					case 8:
						System.out.println("Você caiu na casa: Av. do Estado");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. do Estado\n");
						break;
					case 9:
						System.out.println("Você caiu na casa: IFCH");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: IFCH\n");
						break;
					case 10:
						System.out.println("Você caiu na casa: Av. do Contorno");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. do Contorno\n");
						break;
					case 11:
						System.out.println("Você caiu na casa: Prisão\n É apenas uma visita!"); //check
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Prisão\n");
						break;
					case 12:
						System.out.println("Você caiu na casa: Sorte/Reves");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Sorte/Reves\n");
						break;
					case 13:
						System.out.println("Você caiu na casa: Av. Reboucas");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Reboucas\n");
						break;
					case 14:
						System.out.println("Você caiu na casa: Av. Santo Amaro");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Santo Amaro\n");
						break;
					case 15:
						System.out.println("Você caiu na casa: CB");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: CB\n");
						break;
					case 16:
						System.out.println("Você caiu na casa: Rua da Consolacao");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Rua da Consolacao\n");
						break;
					case 17:
						System.out.println("Você caiu na casa: Lucro/Dividendos");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Lucro/Dividendos\n");
						break;
					case 18:
						System.out.println("Você caiu na casa: Av. Morumbi");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Morumbi\n");
						break;
					case 19:
						System.out.println("Você caiu na casa: Av. Higienopolis");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Higienopolis\n");
						break;
					case 20:
						System.out.println("Você caiu na casa: Av. Sao Joao");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Sao Joao\n");
						break;
					case 21:
						System.out.println("Você caiu na casa: Parada Livre - Férias\n Aproveite um pouco, pegue uma bebiba!"); //check
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Parada Livre\n");
						break;
					case 22:
						System.out.println("Você caiu na casa: Av. Ipiranga");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Ipiranga\n");
						break;
					case 23:
						System.out.println("Você caiu na casa: FEF");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: FEF\n");
						break;
					case 24:
						System.out.println("Você caiu na casa: Impostos de Renda");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Impostos de Renda\n");
						break;
					case 25:
						System.out.println("Você caiu na casa: Sorte/Reves");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Sorte/Reves\n");
						break;
					case 26:
						System.out.println("Você caiu na casa: Rua Brigadeiro Faria Lima");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Rua Brigadeiro Faria Lima\n");
						break;
					case 27:
						System.out.println("Você caiu na casa: Av. Paulista");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Paulista\n");
						break;
					case 28:
						System.out.println("Você caiu na casa: Sorte/Reves");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Sorte/Reves\n");
						break;
					case 29:
						System.out.println("Você caiu na casa: Av. Recife");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Recife\n");
						break;
					case 30:
						System.out.println("Você caiu na casa: IC");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: IC\n");
						break;
					case 31:
						System.out.println("Você caiu na casa: Vá para a prisao\n Caiu a casa pra você!");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Vá para a prisao\n");
						Tab.jogadores.get(j).getPeca().setPosicao(11);
						// Colocar as formas que o jogador pode sair da prisão
						break;
					case 32:
						System.out.println("Você caiu na casa: Av. JK");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. JK\n");
						break;
					case 33:
						System.out.println("Você caiu na casa: Sorte/Reves");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Sorte/Reves\n");
						break;
					case 34:
						System.out.println("Você caiu na casa: Rua Oscar Freire");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Rua Oscar Freire\n");
						break;
					case 35:
						System.out.println("Você caiu na casa: Av. Ibirapuera");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Ibirapuera\n");
						break;
					case 36:
						System.out.println("Você caiu na casa: Av. Vieira Souto");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Vieira Souto\n");
						break;
					case 37:
						System.out.println("Você caiu na casa: Praça da Paz");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Praça da Paz\n");
						break;
					case 38:
						System.out.println("Você caiu na casa: Av. Presidente Vargas");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Presidente Vargas\n");
						break;
					case 39:
						System.out.println("Você caiu na casa: Sorte/Reves");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Sorte/Reves\n");
						break;
					case 40:
						System.out.println("Você caiu na casa: Av. Niemeyer");
						escritor.write(Tab.jogadores.get(j).getNome() + " caiu na casa: Av. Niemeyer\n");
						break;
				}
				if (Tab.jogadores.get(j).getDinheiro() <= 0) {
					jogo = false;
					System.out.println("Jogo finalizado");
					rod = rod - 2;
				} else {
					jogo = true;
					System.out.println("Vocês querem jogar mais uma rodada? (sim/não)");
					String Op = teclado.nextLine();
					if (Op.equalsIgnoreCase("sim")) {
						rod = rod + 1;	
					} else {
						rod = rod - 2;
					}
				}
			}
		}
		escritor.close();
		teclado.close();
	}
}