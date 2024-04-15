package lab01;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws InterruptedException {
		int millis = 1000, atual;
		Scanner teclado = new Scanner(System.in);
		
		/* 
		 * Instanciando todos os objetos de todas as classes e relacionando propriedades e jogadores ao tabuleiro
		 */
		
		Tabuleiro Tab = new Tabuleiro(); // 
		Jogador j1 = new Jogador("Luccas", "370.812.288-79", "luccas@gmail.com", "Link", 0, 2458); //Jogador (String nome, String cpf, String email, String foto, int id, int dinheiro)
		Peça p1 = new Peça("Azul", 0); //Peça (String cor, int posicao)
		CartaSorte cs1 = new CartaSorte(1, "Começar o jogo", 0, 0, 0, "Vá para casa Iniciar", 0, 0); //CartaSorte(int id, String descricao, int movimento, int efeito, float valor, String acao, int tempo, int restricao)
		Propriedade AvSantoAmaro = new Propriedade(1, "Avenida Santo Amaro", "", 1000, 200); //Propriedade(int id, String nome, String proprietario, int preco, float aluguel)
		Terreno t1 = new Terreno("Terreno A","", 1, 100, 500, false); //Terreno(String nome, String proprietario, int numeroCasas, int valorCasa, int valorHotel, boolean hotel)
		Estacao e1 = new Estacao("",""); // 
		ServicoPublico sp1 = new ServicoPublico("",""); // 
		Tab.addPropriedade(28); //É criado as 28 propriedades do tabuleiro
		
		/*
		 * Compra e venda de 1 casa para o jogador (j1)
		 */
		if(j1.getDinheiro() > t1.getValorCasa()) {
			t1.comprarCasa();
			atual = j1.getDinheiro() - t1.getValorCasa();
			j1.setDinheiro(atual);
			t1.setProprietario(j1.getNome());
			t1.setNumeroCasas(t1.getNumeroCasas() + 1);
		}
			
		/*
		 * Interação com o usuário para realizar o cadastro dos jogadores a serem inseridos na partida.
		 * A ideia é que todo o jogo seja interativo ao final do semestre, para isso realizarei algumas mudanças na main
		 * com o intuito de ir realizando interações com o usuário ao longo do jogo.
		 */
		
		System.out.println("Seja bem vindo ao Monopoly!"); 
		Thread.sleep(millis);
		
		System.out.println("Quantos jogadores terão na partida?");
		String NumdeJogadores = teclado.nextLine();
		int Num_Jogadores = Integer.parseInt(NumdeJogadores);
		
		if(Num_Jogadores > 6 || Num_Jogadores < 2) {
			System.out.println("Número de jogadores inválido, o Monopoly pode ser jogado de 2 a 6 jogadores");
		} else {
			Tab.addJogador(Num_Jogadores);
			
			for (int i = 0; i < Num_Jogadores; i++) {
				int j = i + 1;
				System.out.println("Digite o nome do Jogador " + j + ":");  
				String Nome_usuario = teclado.nextLine();
				Tab.jogadores.get(i).setNome(Nome_usuario);
				
				Boolean resp = false, Email = false;
				
				while (resp == false) {
					System.out.println("Certo " + Tab.jogadores.get(i).getNome() + ", agora digite seu CPF: "); //Pede para o usuario inserir o CPF
					String CPF_digitado = teclado.nextLine();
					Tab.jogadores.get(i).setCpf(CPF_digitado);
					resp = Tab.jogadores.get(i).validarCPF(CPF_digitado); //Enquanto o usuario nao inserir um CPF valido, nao sera possivel dar prosseguimento
				}
				
				System.out.println("Seu CPF está sendo analisado, só um instante.");
				Thread.sleep(millis);
				System.out.println(">>> CPF validado <<< \n"); //CPF validado com sucesso
							
				while (Email == false) {
					System.out.println("Digite seu e-mail: "); //Pede para o usuario inserir o email			
					String email_digitado = teclado.nextLine();
					Tab.jogadores.get(i).setEmail(email_digitado);
					Email = Tab.jogadores.get(i).validarEmail(email_digitado); //Enquanto o usuario nao inserir um email valido, nao sera possivel dar prosseguimento
				}
				
				System.out.println("Seu Email está sendo analisado, só um instante.");
				Thread.sleep(millis);
				System.out.println(">>> Email validado <<< \n"); //Email validado com sucesso

				System.out.println("Insira o link de sua foto: "); //Pede para o usuario inserir a foto
				String foto_inserida = teclado.nextLine();
				Tab.jogadores.get(i).setFoto(foto_inserida);
				
				if(i != Num_Jogadores - 1) {
					System.out.println("\nPróximo jogador a ser cadastrado!\n");
				}
			}
		}
		Thread.sleep(millis);
		System.out.println("Cadastros finalizados, aguardem para as próximas instruções.");
		System.out.println(Tab.jogadores);
	}
}