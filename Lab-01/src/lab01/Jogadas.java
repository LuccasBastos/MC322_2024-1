package lab01;

import java.util.Scanner;

public class Jogadas {
	public static String Av_1 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_2 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_3 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_4 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_5 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_6 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_7 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_8 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_9 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_10 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_11 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_12 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_13 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_14 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_15 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_16 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_17 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_18 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_19 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_20 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_21 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String Av_22 (Jogador j, Terreno t){
		String resp = "";
		if ((t.getDono()) == null){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Você quer comprar essa rua? (sim/não)");
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				System.out.println("Saldo antes da compra: "+ j.getDinheiro());
				System.out.println("Valor de "+ t.getDescricao() + " é: " + t.getPreco());

				j.setDinheiro(j.getDinheiro() - t.getPreco());
				t.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){

			} else {
				System.out.println("Opção inválida.");
	            return "Opção inválida.";
	        }
		} else if (t.getDono() == j) {
			System.out.println("Você quer adicionar uma casa? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				if(t.getNumeroCasas() < 4) {
					j.setDinheiro(j.getDinheiro() - t.getValorCasa());
					t.comprarCasa();
					String p1 = j.getNome() + " pagou aluguel para " + t.getDono().getNome();
					String p2 = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
					resp = p1 + "\n" + p2;
					System.out.println(resp);
				} else {
					j.setDinheiro(j.getDinheiro() - t.getValorHotel());
					t.comprarHotel();
				}
			}
		} else {
			j.setDinheiro(j.getDinheiro() - Math.round(t.getAluguel()));
			t.getDono().setDinheiro(t.getDono().getDinheiro() + Math.round(t.getAluguel()));
			resp = t.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + t.getDono().getDinheiro();
		}
		return resp;
	}
	
	public static String RU (Jogador j, Estacao e){
		String resp = "";
		if ((e.getDono()) == null){
			System.out.println("Você quer comprar essa estação? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				j.setDinheiro(j.getDinheiro() - e.getPreco());
				e.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){
	
			} else {
	            System.out.println("Opção inválida.");
	
			}
		} else if (e.getDono() != j) {
			int aluguel = e.calcularAluguel();
			j.setDinheiro(j.getDinheiro() - aluguel);
			e.getDono().setDinheiro(e.getDono().getDinheiro() + aluguel);
			String p1 = e.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + e.getDono().getDinheiro();
			String p2 = j.getNome() + ", seu novo saldo agora é: " + j.getDinheiro();
			resp = p1 + "\n" + p2;
		} else {
	
		}
		return resp;
	}
	
	public static String IFCH (Jogador j, Estacao e){
		String resp = "";
		if ((e.getDono()) == null){
			System.out.println("Você quer comprar essa estação? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				j.setDinheiro(j.getDinheiro() - e.getPreco());
				e.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){
	
			} else {
	            System.out.println("Opção inválida.");
	
			}
		} else if (e.getDono() != j) {
			int aluguel = e.calcularAluguel();
			j.setDinheiro(j.getDinheiro() - aluguel);
			e.getDono().setDinheiro(e.getDono().getDinheiro() + aluguel);
			String p1 = e.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + e.getDono().getDinheiro();
			String p2 = j.getNome() + ", seu novo saldo agora é: " + j.getDinheiro();
			resp = p1 + "\n" + p2;
		} else {
	
		}
		return resp;
	}
	
	public static String CB (Jogador j, Estacao e){
		String resp = "";
		if ((e.getDono()) == null){
			System.out.println("Você quer comprar essa estação? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				j.setDinheiro(j.getDinheiro() - e.getPreco());
				e.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){
	
			} else {
	            System.out.println("Opção inválida.");
	
			}
		} else if (e.getDono() != j) {
			int aluguel = e.calcularAluguel();
			j.setDinheiro(j.getDinheiro() - aluguel);
			e.getDono().setDinheiro(e.getDono().getDinheiro() + aluguel);
			String p1 = e.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + e.getDono().getDinheiro();
			String p2 = j.getNome() + ", seu novo saldo agora é: " + j.getDinheiro();
			resp = p1 + "\n" + p2;
		} else {
	
		}
		return resp;
	}
	
	public static String FEF (Jogador j, Estacao e){
		String resp = "";
		if ((e.getDono()) == null){
			System.out.println("Você quer comprar essa estação? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				j.setDinheiro(j.getDinheiro() - e.getPreco());
				e.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){
	
			} else {
	            System.out.println("Opção inválida.");
	
			}
		} else if (e.getDono() != j) {
			int aluguel = e.calcularAluguel();
			j.setDinheiro(j.getDinheiro() - aluguel);
			e.getDono().setDinheiro(e.getDono().getDinheiro() + aluguel);
			String p1 = e.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + e.getDono().getDinheiro();
			String p2 = j.getNome() + ", seu novo saldo agora é: " + j.getDinheiro();
			resp = p1 + "\n" + p2;
		} else {
	
		}
		return resp;
	}
	
	public static String IC (Jogador j, Estacao e){
		String resp = "";
		if ((e.getDono()) == null){
			System.out.println("Você quer comprar essa estação? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
			if (Op.equalsIgnoreCase("sim")) {
				j.setDinheiro(j.getDinheiro() - e.getPreco());
				e.setDono(j);
				resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
			} else if (Op.equalsIgnoreCase("não")){
	
			} else {
	            System.out.println("Opção inválida.");
	
			}
		} else if (e.getDono() != j) {
			int aluguel = e.calcularAluguel();
			j.setDinheiro(j.getDinheiro() - aluguel);
			e.getDono().setDinheiro(e.getDono().getDinheiro() + aluguel);
			String p1 = e.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + e.getDono().getDinheiro();
			String p2 = j.getNome() + ", seu novo saldo agora é: " + j.getDinheiro();
			resp = p1 + "\n" + p2;
		} else {
	
		}
		return resp;
	}
	
	public static String Praca_Paz (Jogador j, Estacao e){
		String resp = "";
		if ((e.getDono()) == null){
			System.out.println("Você quer comprar essa estação? (sim/não)");
			Scanner teclado = new Scanner(System.in);
			String Op = teclado.nextLine();
				if (Op.equalsIgnoreCase("sim")) {
					j.setDinheiro(j.getDinheiro() - e.getPreco());
					e.setDono(j);
					resp = j.getNome() + ", seu saldo agora é: " + j.getDinheiro();
				} else if (Op.equalsIgnoreCase("não")){
		
				} else {
		            System.out.println("Opção inválida.");
		
				}
		} else if (e.getDono() != j) {
			int aluguel = e.calcularAluguel();
			j.setDinheiro(j.getDinheiro() - aluguel);
			e.getDono().setDinheiro(e.getDono().getDinheiro() + aluguel);
			String p1 = e.getDono().getNome() + ", você recebeu um aluguel e seu saldo é: " + e.getDono().getDinheiro();
			String p2 = j.getNome() + ", seu novo saldo agora é: " + j.getDinheiro();
			resp = p1 + "\n" + p2;
		} else {
	
		}
		return resp;
	}
}