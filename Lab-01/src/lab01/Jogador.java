package lab01;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jogador {
	private String nome;
	private String cpf;
	private String email;
	private String foto;
	
	//Construtor
	public Jogador () {
		
	}
	
	public Jogador (String nome, String cpf, String email, String foto) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.foto = foto;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public static boolean validarCPF(String cpf){
		String newcpf = cpf.replaceAll("\\p{Punct}","");
	
		//Verificar se o CPF tem 11 digitos, caso contrário retornar falso
		int i, n = 0;
		n = newcpf.length(); //Devolve o tamanho do CPF	
		if (n != 11) {
			return false;
		}
		
		//Verificar se todos os digitos apresentados no cpf for igual, retornar falso
		int p = 0, y =0;
		char [] arrayCpf = newcpf.toCharArray();
		//int[] Intcpf = new int[arrayCpf.length];
		
		p = newcpf.length();
		for (i = 1; i < p; i++) {
			if(arrayCpf[0] == arrayCpf[i]) {
				y = y + 1;
			}
			if (y==10) {
				return false;
			}
		}
	
		//Calculo dos digitos verificadores usando o algoritmo que temos
		int somador = 0;
		int soma = 0;
		for (i = 0; i < newcpf.length(); i++) {
			char caractere = newcpf.charAt(i);
			somador = Character.getNumericValue(caractere);
			soma = soma + somador;
			}
		
		if (soma != 00 && soma != 11 && soma != 22 && soma != 33 && soma != 44 && soma != 55 && soma != 66 && soma != 77 && soma != 88 && soma != 99){
			return false;}
		
		//Verificar se os dígitos verificadores calculados são iguais aos verificadores do CPF
		int soma1 = 0;
		int resto1 = 0;
		int sum = 0;
		for (i = 0; i < 9; i++) {
			char num = newcpf.charAt(i);
			soma1 = Character.getNumericValue(num);
			sum = sum + (soma1 * (i+1));
			if (i==8) {
				resto1 = sum % 11;
			}
		}
		
		int soma2 = 0;
		int resto2 = 0;
		int summ = 0;
		for (i = 0; i < 10; i++) {
			char num = newcpf.charAt(i);
			soma2 = Character.getNumericValue(num);
			summ = summ + (soma2 * i);
			if (i==9) {
				resto2 = summ % 11;
			}
		}
		
		int numb = 0;
		for (i = 9; i < 10; i++) {
			char num = newcpf.charAt(i);
			numb = Character.getNumericValue(num);
			if (numb != resto1) {
				return false;
			}
		}
		
		int numbe = 0;
		for (i = 10; i < 11; i++) {
			char num = newcpf.charAt(i);
			numbe = Character.getNumericValue(num);
			if (numbe != resto2) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validarEmail(String email){
		String newEmail = email;
		
		String regex, input;
		Pattern pattern = Pattern.compile(regex = "([a-z0-9_-_.]{2,})@([a-z0-9]{2,})(\\.[a-z]{2,})(\\.[a-z]{2,})?");
		Matcher matcher = pattern.matcher(newEmail);
		
		if (matcher.find() == true) {
			return true;
		}
		else {
			return false;
		}
		
	}
			
}