package uri;

import java.util.Scanner;
import java.util.ArrayList;

class MaiorAleatorio {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);
		int i = 0, maior = 0, posicao = 0, numero = 0;
		ArrayList<Integer> comparador = new ArrayList<>();
		int numeros[] = new int[100];

		while (i <= 99) {
			numero = entrada.nextInt();

			if (numero > -1) {

				if (comparador.contains(numero)) {
					comparador.add((numero * 2) + i);
	
				} else {
					comparador.add(numero);
				}
				if (numeros[i] > maior) {
					maior = numeros[i];
					posicao = i;
				}
				++i;
			}
          
			entrada.nextLine();

		}

		entrada.close();
		System.out.println(maior);
		System.out.println(posicao);

	}

}
