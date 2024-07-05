package lab01;
import java.util.Random;
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
		Random random = new Random();
		int dado1 = random.nextInt(6) + 1;
		int dado2 = random.nextInt(6) + 1;
		int dados = dado1 + dado2;
		return dados;
	}
	
	public static int jogarDado() {
		Random random = new Random();
		int dado1 = random.nextInt(6) + 1;
		return dado1;
	}
	
	public static String CartaSR(Jogador j, int num_Jogadores) {
		Random r = new Random();
		int RS = (r.nextInt(2)+1);
		int sort = (r.nextInt(15)+1);
		String res = "";
		
		switch (RS) {
			case 1:
				switch (sort) {
					case 1:
						res = "Você participou de um concurso cultural e agora vai conhecer todo litoral brasileiro. Receba $800.";
						j.setDinheiro(j.getDinheiro() + 800);
						return res;
					case 2:
						res =  "Você recebeu um prêmio especial! Receba $500";
						j.setDinheiro(j.getDinheiro() + 500);
						return res;
					case 3:
						res =  "Parabéns! Você ganhou um prêmio! Receba $800";
						j.setDinheiro(j.getDinheiro() + 800);
						return res;
					case 4:
						res =  "Com o cartão de crédito você tem muitos benefícios para aproveitar. Receba $1500";
						j.setDinheiro(j.getDinheiro() + 1500);
						return res;
					case 5:
						res =  "Você acumulou pontos e pode trocar por combustível. Receba $200";
						j.setDinheiro(j.getDinheiro() + 200);
						return res;
					case 6:
						res =  "Você ganhou uma promoção de créditos para mandar SMS. Receba $500";
						j.setDinheiro(j.getDinheiro() + 500);
						return res;
					case 7:
						res =  "Você passou nos testes para fazer o novo comercial dos produtos de beleza. Receba $600";
						j.setDinheiro(j.getDinheiro() + 800);
						return res;
					case 8:
						res =  "Você ganhou uma promoção e agora vai ter tanque cheio até o fim do ano. Receba $500";
						j.setDinheiro(j.getDinheiro() + 500);
						return res;
					case 9:
						res =  "Com o cartão de crédito você tem muito mais segurança. Receba $1500";
						j.setDinheiro(j.getDinheiro() + 1500);
						return res;
					case 10:
						res =  "Você carregou seu celular e ganhou ainda mais créditos! Receba $1000";
						j.setDinheiro(j.getDinheiro() + 1000);
						return res;
					case 11:
						res =  "Seu carro foi roubado, mas você tinha seguro. Receba $1000";
						j.setDinheiro(j.getDinheiro() + 1000);
						return res;
					case 12:
						res =  "Ganhou um roteiro de viagem! Escolha o lugar de preferência e faça as malas. Receba $450";
						j.setDinheiro(j.getDinheiro() + 450);
						return res;
					case 13:
						res =  "Você ganhou um concurso de personalização de carros. Receba $750";
						j.setDinheiro(j.getDinheiro() + 750);
						return res;
					case 14:
						j.setDinheiro(j.getDinheiro() + 500 * num_Jogadores);					
						res =  "Você fez uma aposta com todos os jogadores da mesa e venceu! Receba $500 multiplicado pelo número de jogadores";
						return res;
					case 15:
						res =  "Você comprou um carro e vai econominar combustível e manutenção. Receba $1000";
						j.setDinheiro(j.getDinheiro() + 1000);
						return res;
				} return res;
				
			case 2:
				switch (sort) {
					case 1:
						res =  "Você tomou uma multa por poluir o meio ambiente. Pague $300";
						j.setDinheiro(j.getDinheiro() - 300);
						return res;
					case 2:
						res =  "A sua operadora de celular não tem sinal no local! Para telefonar pague. Pague $150";
						j.setDinheiro(j.getDinheiro() - 150);
						return res;
					case 3:
						res =  "Ver a cara de surpresa da sua filha com o seu presente não tem preço! Que bom que você tem um cartão. Pague $300";
						j.setDinheiro(j.getDinheiro() - 300);
						return res;
					case 4:
						res =  "Vá para a prisão";
						j.getPeca().setPosicao(99);				
						return res;
					case 5:
						res =  "Chegou o feriado e você decidiu fazer uma viagem à praia com a família. Pague $200";
						j.setDinheiro(j.getDinheiro() - 200);
						return res;
					case 6:
						res =  "Com o seu cartão você pode dividir aquele pagamento e pagar agora apenas esta primeira parcela. Pague $250";
						j.setDinheiro(j.getDinheiro() - 250);
						return res;
					case 7:
						res =  "Adquiriu um roteiro de ecoturismo e gostou tanto da viagem que decidiu estender por mais 2 dias. Pague $500";
						j.setDinheiro(j.getDinheiro() - 500);
						return res;
					case 8:
						res =  "O posto que você abasteceu tinha gasolina adulterada! Para consertar o carro. Pague $500";
						j.setDinheiro(j.getDinheiro() - 500);
						return res;
					case 9:
						res =  "Você vai abrir a sua loja e não podem faltar produtos de beleza. Pague $500";
						j.setDinheiro(j.getDinheiro() - 500);
						return res;
					case 10:
						res =  "Você investiu em fundos imobiliários. Pague $1000";
						j.setDinheiro(j.getDinheiro() - 1000);
						return res;
					case 11:
						res =  "Preocupado com o futuro, você colocou dinheiro na sua previdência. Pague $200";
						j.setDinheiro(j.getDinheiro() - 200);
						return res;
					case 12:
						res =  "Chegou a nova linha de produtos de beleza. Você já está na fila pra comprar. Pague $90";
						j.setDinheiro(j.getDinheiro() - 90);
						return res;
					case 13:
						res =  "Você estacionou seu carro em local proibido. Pague $1000";
						j.setDinheiro(j.getDinheiro() - 1000);
						return res;
					case 14:
						res =  "As tarifas da sua operadora de celular estão muito altas. Pague $220";
						j.setDinheiro(j.getDinheiro() - 220);
						return res;
					case 15:
						res =  "Pagou caro pela troca de óleo! Pague $300";
						j.setDinheiro(j.getDinheiro() - 300);
						return res;
			}
		}
	return res;
	}
}