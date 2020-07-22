package listas;

import java.util.EnumSet;
public class TesteEnumerado {

	public static void main(String[] args) {
	
	System.out.println(Livros.CODE_CLEAN.getTitulo());	
		
	for(Livros Livro : Livros.values())	{
		
		System.out.println(Livro.getTitulo()+ " :" + Livro.getAnoPublicacao());
		
		
	}
	
	for(Livros livro : EnumSet.range(Livros.JAVA,Livros.UML)) {

		System.out.println(livro.getTitulo()+":"+ livro.getAnoPublicacao());
	}

	}

}
