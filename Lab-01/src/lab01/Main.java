package lab01;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//System.out.println("executando código!"); //Validacao se o programa esta funcionando corretamente no inicio
		
		Scanner cpf = new Scanner(System.in);
		
		System.out.println("Digite seu CPF: ");
		String CPF_digitado = cpf.nextLine();
		
		Jogador j1 = new Jogador(); // Um novo jogador é inserido
		
		Boolean resp;
		resp = j1.validarCPF(CPF_digitado); //Chama a validacao do CPF para verificar a veracidade
		//System.out.println(resp);
		
		while (resp == false) {
			System.out.println("Seu CPF é inválido, digite novamente: ");
			CPF_digitado = cpf.nextLine();
			resp = j1.validarCPF(CPF_digitado); //Enquanto o usuario nao inserir um CPF valido, nao sera possivel dar prosseguimento
		}
			System.out.println("CPF validado!"); //Tudo certo, segue o jogo
	}
}