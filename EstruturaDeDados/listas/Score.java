package listas;

public class Score {
	public static final int MAXIMO_DE_ENTRADAS = 10;
	protected int numEntrada;
	protected EntradaDoJogo []entrada = new EntradaDoJogo[MAXIMO_DE_ENTRADAS];

	
	public Score () {
		numEntrada = 0;
	}
	
	public String toString() {
		String separador = ",";
		
		for (int i = 0; i < numEntrada; i++) {
			if (i> 0) separador+= ",";
			separador+=entrada[i];
		}
		
		return separador +"]";
	}
	
	public void adicionar(EntradaDoJogo novo) {
		int novoScore = novo.score;
		
		if(numEntrada == MAXIMO_DE_ENTRADAS) {
			if (novoScore <= entrada[numEntrada-1].getScore())
				return;//a nova entrada nao é um dos maiores scores
		}
		else // o arranjo não esta cheio
			numEntrada++;
		//localiza o lugar onde o novo registro (com score grande) deve ficar
		int i = numEntrada -1;
		
		for (;(i>=1)&&(novoScore > entrada[i-1].getScore());i --) {
			entrada[i]= entrada[i-1]; //move a entrada i uma posição a direita
			entrada[i] = novo;
		}
		
	}
}
