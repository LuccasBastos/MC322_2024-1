package lab01;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws InterruptedException {
		Tabuleiro Tab = new Tabuleiro();
		Jogador j1 = new Jogador();
		Peça p1 = new Peça("Azul"); // Uma nova peca e inserida
		CartaSorte cs1 = new CartaSorte("Vá para casa Iniciar"); // Uma nova carta sorte e inserida
		Propriedade AvSantoAmaro = new Propriedade("Avenida Santo Amaro", j1.getNome());
		/*Propriedade AvReboucas = new Propriedade("Avenida Rebouças", j1.getNome());
		Propriedade RConsolacao = new Propriedade("Rua da Consolação", j1.getNome());*/
		Terreno t1 = new Terreno("","");
		Estacao e1 = new Estacao("","");
		ServicoPublico sp1 = new ServicoPublico("","");
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> jogadores = new ArrayList<String>();
		
		System.out.println("Olá jogador, seja bem vindo ao Monopoly!"); 
		Thread.sleep(1000);
		
		System.out.println("Quantos jogadores terão na partida?");
		String NumdeJogadores = teclado.nextLine();
		int Num_Jogadores = Integer.parseInt(NumdeJogadores);
		
		if(Num_Jogadores > 6 || Num_Jogadores < 2) {
			System.out.println("Número de jogadores inválido, o Monopoly pode ser jogado de 2 a 6 jogadores");
		} else {
				Tab.addJogador(Num_Jogadores);
			}
						
		/*System.out.println("Para começar, realizaremos o seu cadastro.\n"); 
		Thread.sleep(2000);
		
		System.out.println("Digite seu Nome: "); //Pede para o usuario inserir o nome completo
		String Nome_usuario = teclado.nextLine();
		j1.setNome(Nome_usuario);
		
		Boolean resp = false, Email = false;
		
		while (resp == false) {
			System.out.println("Certo " + j1.getNome() + ", agora digite seu CPF: "); //Pede para o usuario inserir o CPF
			String CPF_digitado = teclado.nextLine();
			j1.setCpf(CPF_digitado);
			resp = j1.validarCPF(CPF_digitado); //Enquanto o usuario nao inserir um CPF valido, nao sera possivel dar prosseguimento
		}
		
		System.out.println("Seu CPF está sendo analisado, só um instante.");
		Thread.sleep(2000);
		System.out.println(">>> CPF validado <<< \n"); //CPF validado com sucesso
					
		while (Email == false) {
			System.out.println("Digite seu e-mail: "); //Pede para o usuario inserir o email
			String email_digitado = teclado.nextLine();
			j1.setEmail(email_digitado);
			Email = j1.validarEmail(email_digitado); //Enquanto o usuario nao inserir um email valido, nao sera possivel dar prosseguimento
		}
		
		System.out.println("Seu Email está sendo analisado, só um instante.");
		Thread.sleep(2000);
		System.out.println(">>> Email validado <<< \n"); //Email validado com sucesso

		System.out.println("Insira o link de sua foto: "); //Pede para o usuario inserir a foto
		String foto_inserida = teclado.nextLine();
		j1.getFoto();
		
		Thread.sleep(2000);
		System.out.println("Cadastro finalizado, aguarde para as próximas instruções.");
		
		Thread.sleep(2000);
		System.out.println("Sua peça é a " + p1.getCor() + " e " + cs1.getAcao());*/
	}
}