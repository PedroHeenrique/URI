package br.com.java.programacao;

public class Heranca {

	public static void main(String[] args) {
    
            ColorForma colorForma = new ColorForma("Amarela", "Piramide ", 18.25, 17.15, "Triangulo");
             ColorForma colorForma2 = new ColorForma(colorForma);
             
            colorForma2.mostrarCorDaForma();
	        colorForma.mostrarCorDaForma();
	  

	}
}
