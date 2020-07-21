package br.com.java.programacao;


public class Formas {
    private double altura;
    private double largura;
    private String nome;
    
    
    Formas (Formas Objeto){
    	altura = Objeto.altura;
    	largura = Objeto.largura;
        nome = Objeto.nome;
    }
    Formas () {
    	
    	altura = largura = 0.0;
    }
    Formas(double altura, double largura,String nome){
    	this.altura = largura;
    	this.largura = altura;
    	this.nome = nome;
    	
    	
    }
    public String getNome() {
    	return nome;
    }
    void mostrarDimensao() {
    	System.out.print("Altura "+ altura + " largura " + largura + " da ");
    }

    public double getAltura() {
    	return altura;
    	
    }
    
    
    public void setAltura(double altura) {
    	
    	if (altura > 0) {
    	  this.altura = altura;	
    	}else
    		System.out.println("Altura invalida Invalido");
  
    }
    
    public double getLargura() {
    	return largura;
    }
    
    public void setLargura(double largura) throws Exception{
    	if(largura > 0) {
    		this.largura = largura;
    	}else
    		
    		throw new Exception("Largura Invalida");
    }
    

}
