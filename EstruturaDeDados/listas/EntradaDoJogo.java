package listas;

class EntradaDoJogo {
	protected int score;
	protected String nome;
	
	public EntradaDoJogo (String n, int s) {
		nome = n;
		score = s;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getScore() {
		return score;
	}
	
	public String toString() {
		return "(" + nome + "," + score + ")";
	}

}
