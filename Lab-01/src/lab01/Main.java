package lab01;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws InterruptedException {
		Scanner teclado = new Scanner(System.in);
		Jogador j1 = new Jogador(); // Um novo jogador e inserido
		Peça p1 = new Peça(); // Uma nova peca e inserida
			p1.setCor("Azul");
		CartaSorte cs1 = new CartaSorte(); // Uma nova carta sorte e inserida
			cs1.setAcao("vá para casa Iniciar");
		
		System.out.println("Olá jogador, seja bem vindo ao Monopoly!"); 
		Thread.sleep(2000);
		System.out.println("Para começar, realizaremos o seu cadastro.\n"); 
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
			Email = j1.validarEmail(email_digitado); //Enquanto o usuario nao inserir um CPF valido, nao sera possivel dar prosseguimento
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
		System.out.println("Sua peça é a " + p1.getCor() + " e " + cs1.getAcao());
	}
}