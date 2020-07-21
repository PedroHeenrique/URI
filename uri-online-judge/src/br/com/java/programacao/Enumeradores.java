package br.com.java.programacao;


enum Transport {
	
	// Quando definimos um construtor para cada ENUM ele é chamado quando cada constante de enumeracao e criada.
	CARRO (120), BARCO(90) , AVIAO(700), TREM(400), BICICLETA(20);
	
	private int speed;
	
	Transport (int s) {
		speed = s;
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
public class Enumeradores {

	public static void main(String[] args) {
	
		Transport veiculo;
		veiculo = Transport.valueOf("BICICLETA");
		System.out.println(Transport.BARCO.getSpeed());
		
		// Retorna a posicao ordinal da constante que chamou esse metodo no caso CARRO
		System.out.println(veiculo.ordinal());
		
		
		for(Transport veicu : Transport.values()) {
			System.out.println(veicu + " speed " + veicu.getSpeed());
		}
	}

}
