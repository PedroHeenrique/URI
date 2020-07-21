package uri;

import java.io.IOException;
import java.util.Scanner;


public class Criptografia {

	/**
	 * Esse metodo ira deslocar 3 posiçoes no alfabeto ASC II Ex: caractere a
	 * deslocado 3 vezes para direita vai virar letra d
	 * 
	 * @param letra
	 * @return
	 */
	public static char deslocarLetras(char caractere) {
		if (naoELetra(caractere))
			return caractere;

		int charNumero = caractere + 3;

		return (char) charNumero;

	}

	/**
	 * Metodo que ira devolver a string alterada, de acordo com a chamada ao metodo
	 * deslocar letras
	 * 
	 * @param referencia
	 * @return char
	 */

	public static boolean naoELetra(char caractere) {
		int numeroDoChar = caractere;

		return ( ((numeroDoChar > 31 && numeroDoChar < 65) || (numeroDoChar > 90 && numeroDoChar < 97)
				|| (numeroDoChar > 122 && numeroDoChar < 254)));

	}

	/*
	 * Na primeira passada, somente caracteres que sejam letras minúsculas e
	 * maiúsculas devem ser deslocadas 3 posições para a direita, segundo a tabela
	 * ASCII: letra 'a' deve virar letra 'd', letra 'y' deve virar caractere '|' e
	 * assim sucessivamente.
	 */
	public static char[] primeiroProcessamento(String palavra) {

		char novaString[] = new char[palavra.length()];
		int cumprimento = palavra.length();

		for (int i = 0; i < cumprimento; i++) {

			novaString[i] = deslocarLetras(palavra.charAt(i));
		}

		return novaString;
	}

	/*
	 * Segunda passada linha deve ser invertida
	 */
	public static char[] segundoProcessamento(String referencia) {

		char novaString[] = referencia.toCharArray();
		int cumprimento = referencia.length();
		int ordem = 0;

		for (int i = cumprimento - 1; i >= 0; i--, ordem++) {
			novaString[ordem] = referencia.charAt(i);	
		}

		return novaString;
	}
	
	public static char[] terceiroProcessamento(String referencia) {
		char novaString[] = referencia.toCharArray();
		int metade = referencia.length() / 2;
        int charAnterior;
		for (int i = 0; i < novaString.length; i++) {
		
			novaString[i] = referencia.charAt(i);
			
			if (i >= metade) {
				charAnterior = ((int)referencia.charAt(i)) -1;
				novaString[i] = (char)charAnterior;
				
			}
			
		}

		return novaString;

	}

	public static void main(String[] args)throws IOException {
		
		
		//BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner entrada = new Scanner(System.in);
		int quantidadeLinhas = 0;
		String palavras [] = new String [0];
		try {
			
			// quantidade de linhas que o programa ira tratar
			quantidadeLinhas = entrada.nextInt();
			palavras = new String[quantidadeLinhas];
			entrada.nextLine();
		
		}catch(IllegalArgumentException exc) {
			System.out.println("Valor invalido " + exc.getMessage());
		}
	
		
		for(int i = 0; i < quantidadeLinhas; i++ ) {
		  	palavras[i] = entrada.nextLine();
	   
		}
		
		
		entrada.close();

		for (int i = 0; i < palavras.length; i++) {
			String primeiraInversao = new String(primeiroProcessamento(palavras[i]));
			String segundaInversao = new String(segundoProcessamento(primeiraInversao));
		    String terceiraPassada = new String (terceiroProcessamento(segundaInversao));
		    System.out.println(terceiraPassada);
			
		}
		
	}

}
