package jogoDaVida;
import static org.junit.Assert.*;

import org.junit.Test;

public class JogoDaVidaTeste {

    JogoDaVida vida;

    @Test
	public void testeConstrutor() {
        
        vida = new JogoDaVida();
        int[][] matriz = vida.getField();
        int tamanho = vida.getTamanho();

        for (int i = 0; i < tamanho; i++) {

			for (int j = 0; j < tamanho; j++) {

				assertNotNull(matriz[i][j]);
			}
		}
    }

    @Test
	public void testeProximaGeracao() {

        JogoDaVida vida = new JogoDaVida();
        
        int[][] matriz = {{0,0,0,0,1,0},
                          {0,0,1,0,0,1},
                          {0,1,1,0,1,0},
                          {0,0,1,0,0,0},
                          {1,0,0,0,0,1},
                          {0,0,0,0,0,0}};

        int[][] proximaGeracaoMatriz = {{0,0,0,0,0,0},
                                        {0,1,1,0,1,1},
                                        {0,1,1,0,0,0},
                                        {0,0,1,1,0,0},
                                        {0,0,0,0,0,0},
                                        {0,0,0,0,0,0}};


        vida.setField(matriz);
        int[][] matrizResultado = vida.proximaGeracao();

            for (int i = 0; i < 5; i++) { 

                for (int j = 0; j < 5; j++) {

                    assertEquals(proximaGeracaoMatriz[i][j], matrizResultado[i][j]);
                }

            }
    }

    @Test
	public void testeContarVizinhos() {

        int[][] matriz = {{0,1,1},
                          {1,0,1},
                          {0,0,0}};

        JogoDaVida vida = new JogoDaVida();
        vida.setField(matriz);
        
        assertEquals(3, vida.contarVizinhos(0, 1));
        assertEquals(1, vida.contarVizinhos(1, 0));
        assertEquals(2, vida.contarVizinhos(0, 2));
        assertEquals(2, vida.contarVizinhos(1, 2));
    }
    
    
}