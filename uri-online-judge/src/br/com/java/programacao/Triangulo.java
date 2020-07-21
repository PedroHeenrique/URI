package br.com.java.programacao;

public class Triangulo extends Formas{
	 String estilo;
	 
	 static {
		 
		 System.out.println("Vem antes da classe");
	 }
	
	 Triangulo (Triangulo obj) {
		 super(obj);
		 estilo = obj.estilo;
		 
	 }
	 Triangulo (){
		 super();
	 }
       Triangulo(double alt, double larg, String estilo, String nome) {
		super(alt, larg,nome);
		this.estilo = estilo;

	}
	 double area() {
		 return (getAltura() * getLargura()) / 2  ;
		
	 }
	 @Override
	 void mostrarDimensao() {
		 super.mostrarDimensao();
		 System.out.print(estilo  + " que é um "+ super.getNome() +" De Cor ");
		 
	 }

}
