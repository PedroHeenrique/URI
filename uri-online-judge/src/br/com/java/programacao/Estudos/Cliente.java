package br.com.java.programacao.Estudos;

public class Cliente {
	String nome;
	int idade;
	String CPF;
	Endereco endereco = new Endereco() ;
	
	Cliente(String nome, int idade, String cpf, String cidade, String rua, String bairro ){
		this.nome = nome;
		this.idade= idade;
		this.CPF = cpf;
		this.endereco.bairro = bairro;
		this.endereco.Ciadade = cidade;
		this.endereco.rua = rua;		
	}
	
	public void getEndereco() {
		System.out.println(endereco.Ciadade);
	}
}
