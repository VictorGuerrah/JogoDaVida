package jogoDaVida;

import java.util.Scanner;

public class Application {

	private static final String RESPOSTA_ACEITE = "Sim";
	private static final String RESPOSTA_NEGACAO = "Não";

	public static void main(String[] args) {

		JogoDaVida jogoDaVida = new JogoDaVida();

		//jogoDaVida.imprimirTabuleiro();

		while(desejaContinuar()) {
			jogoDaVida.simularNovaGeracao();
		}
		
		// System.out.println("Aplicação finalizada!");

	}

	public static Boolean desejaContinuar() {
		return solicitarResposta().equals(RESPOSTA_ACEITE);
	}

	public static String solicitarResposta() {
		
		Scanner scanner = new Scanner(System.in);
		
			String resposta = "";
			Boolean valido = false;

			while(!valido) {

				//imprimirPergunta();
			
				resposta = scanner.nextLine();
				
				valido = isRespostaValida(resposta);
				
				//if(!valido) {
					//System.out.println("Resposta inválida.");
				//}
			}
			
			return resposta;
	}
	
	private static boolean isRespostaValida(String resposta) {
		return resposta.equals(RESPOSTA_ACEITE) || resposta.equals(RESPOSTA_NEGACAO);
	}

	//private static void imprimirPergunta() {
		// System.out.println("Deseja consultar a próxima geração?");
	//}
}