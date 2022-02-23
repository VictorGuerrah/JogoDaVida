package jogoDaVida;

import java.util.Scanner;

public class Application {

	private static final String RESPOSTA_ACEITE = "Sim";
	private static final String RESPOSTA_NEGACAO = "N�o";

	public static void main(String[] args) {

		JogoDaVida jogoDaVida = new JogoDaVida();

		//jogoDaVida.imprimirTabuleiro();

		while(desejaContinuar()) {
			jogoDaVida.simularNovaGeracao();
		}
		
		// System.out.println("Aplica��o finalizada!");

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
					//System.out.println("Resposta inv�lida.");
				//}
			}
			
			return resposta;
	}
	
	private static boolean isRespostaValida(String resposta) {
		return resposta.equals(RESPOSTA_ACEITE) || resposta.equals(RESPOSTA_NEGACAO);
	}

	//private static void imprimirPergunta() {
		// System.out.println("Deseja consultar a pr�xima gera��o?");
	//}
}