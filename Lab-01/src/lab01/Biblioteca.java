package lab01;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Biblioteca {
	/*
	 * Validacao do CPF digitado pelo usuario segundo os seguintes parametros:
	 	* Remover todos os caracteres nao numericos do CPF usando o metodo replaceAll.
	 	* Verificar se o CPF tem 11 dıgitos. Se nao tiver, retornar false.
	 	* Verificar se todos os dIgitos sao iguais. Se forem, retornar false.
	 	* Calcular os dıgitos verificadores usando o algoritmo apropriado.
	 	* Verificar se os dıgitos verificadores calculados sao iguais aos dıgitos verificadores do CPF. Se forem, retornar true. Caso contrario, false.
	 	* Caso o CPF seja validado sera mostrado uma mensagem positiva referente a verificacao, caso contrario, sera pedido para digitar novamente.
	 */
	
	public boolean validarCPF(String cpf){
		String newcpf = cpf.replaceAll("\\p{Punct}","");
	
		//Verificar se o CPF tem 11 digitos, caso contrário, retornar falso
		int i, n = 0;
		n = newcpf.length();
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
		
		//Verificar se os digitos verificadores calculados sao iguais aos verificadores do CPF
		int soma1 = 0;
		int resto1 = 0;
		int sum = 0;
		for (i = 0; i < 9; i++) {
			char num = newcpf.charAt(i);
			soma1 = num - '0';
			sum = sum + (soma1 * (i+1));
			if (i==8) {
				resto1 = sum % 11;
			if (resto1 == 10 || resto1 == 11) {
					resto1 = 0;
				}
			}
		
		}
		
		int soma2 = 0;
		int resto2 = 0;
		int summ = 0;
		for (i = 0; i < 10; i++) {
			char num = newcpf.charAt(i);
			soma2 = num - '0';
			summ = summ + (soma2 * i);
			if (i==9) {
				resto2 = summ % 11;
			if (resto2 == 10 || resto2 == 11) {
					resto2 = 0;
				}
			}
		}
		
		int numb = 0;
		for (i = 9; i < 10; i++) {
			char num = newcpf.charAt(i);
			numb = num - '0';
			if (numb != resto1) {
				return false;
			}
		}
		
		int numbe = 0;
		for (i = 10; i < 11; i++) {
			char num = newcpf.charAt(i);
			numbe = num - '0';
			if (numbe != resto2) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Verificacao do email inserido pelo usuario com base nos seguintes criterios:
	 * Analisar se o email contem uma palavra, envolvendo numero ou não, em seguida o @, outra palavra referente ao dominio e, por ultimo, os servidores .
	 * Caso obedeca todos os pré requisitos, retornará verdade e uma frase positiva relativo a verificacao. Caso contrario inserir o email novamente.
	 */
	
	public boolean validarEmail(String email){
		String newEmail = email;
		Pattern pattern = Pattern.compile("([a-z0-9_-_.]{2,})@([a-z0-9]{2,})(\\.[a-z]{2,})(\\.[a-z]{2,})?(\\\\.[a-z]{2,})?");
		Matcher matcher = pattern.matcher(newEmail);
		
		return matcher.find();
	}
	
	public static int lancarDados() {
		int dado = (int) (Math.random()*12+1);
		return dado;
	}
}