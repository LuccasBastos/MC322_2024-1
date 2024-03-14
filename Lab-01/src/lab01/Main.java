package lab01;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Jogador j1 = new Jogador(); // Um novo jogador é inserido
		
		System.out.println("Digite seu Nome Completo: ");
		String Nome_usuario = teclado.nextLine();
		
		Boolean resp = false, Email = false;
		
		while (resp == false) {
			System.out.println("Digite seu CPF: ");
			String CPF_digitado = teclado.nextLine();
			resp = j1.validarCPF(CPF_digitado); //Enquanto o usuario nao inserir um CPF valido, nao sera possivel dar prosseguimento
		}
			System.out.println(">>> CPF validado! <<< \n"); 
					
		while (Email == false) {
			System.out.println("Digite seu e-mail: ");
			String email_digitado = teclado.nextLine();
			Email = j1.validarEmail(email_digitado); //Enquanto o usuario nao inserir um CPF valido, nao sera possivel dar prosseguimento
		}
			System.out.println(">>> Email validado! <<< \n");

		System.out.println("Insira o link de sua foto: ");
		String foto_inserida = teclado.nextLine();		
	}
		
}