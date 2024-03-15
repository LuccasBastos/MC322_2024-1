package lab01;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Jogador j1 = new Jogador(); // Um novo jogador é inserido
		
		System.out.println("Digite seu Nome Completo: "); //Pede para o usuario inserir o nome completo
		String Nome_usuario = teclado.nextLine();
		
		Boolean resp = false, Email = false;
		
		while (resp == false) {
			System.out.println("Digite seu CPF: "); //Pede para o usuario inserir o CPF
			String CPF_digitado = teclado.nextLine();
			resp = j1.validarCPF(CPF_digitado); //Enquanto o usuario nao inserir um CPF valido, nao sera possivel dar prosseguimento
		}
			System.out.println(">>> CPF validado! <<< \n"); //CPF validado com sucesso
					
		while (Email == false) {
			System.out.println("Digite seu e-mail: "); //Pede para o usuario inserir o email
			String email_digitado = teclado.nextLine();
			Email = j1.validarEmail(email_digitado); //Enquanto o usuario nao inserir um CPF valido, nao sera possivel dar prosseguimento
		}
			System.out.println(">>> Email validado! <<< \n"); //Email validado com sucesso

		System.out.println("Insira o link de sua foto: "); //Pede para o usuario inserir a foto
		String foto_inserida = teclado.nextLine();		
	}		
}