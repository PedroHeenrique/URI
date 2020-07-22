package listas;

public enum Livros {
	
	JAVA("Programação com java uma abordagem abrangente ", "2004"),
	UML("Linguagem de modelagem Unificada ", "2007"),
	CODE_CLEAN("Codigo Limpo ", "2004"),
	CODIFICADOR_LIMPO("Codificador Limpo ","2014");
	
	private final String titulo;
	private final String ano;
	
	Livros(String titulo, String anoPublicacao){
	    
		this.titulo = titulo;
		this.ano = anoPublicacao;
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAnoPublicacao() {
		
		return ano;
	}

}
