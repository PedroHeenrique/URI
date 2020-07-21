package br.com.java.programacao;

public class ColorForma extends Triangulo {
	
	private String cor;
	
	ColorForma(ColorForma objeto){
		super(objeto);
		cor = objeto.cor;
		
	}
	
	ColorForma (String cor, String estilo, double altura, double largura,String nome){
		super(altura,largura,estilo,nome);
		this.cor = cor;	
		
	}
   
	String getCor () {return cor;}
	
	void mostrarCorDaForma() {
		super.mostrarDimensao();
		System.out.println(cor);
		
	}
}
