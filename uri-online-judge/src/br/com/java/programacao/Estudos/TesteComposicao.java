package br.com.java.programacao.Estudos;

public class TesteComposicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Endereco end ;
		//end.bairro ="Santo Antonio";
		//end.Ciadade ="Louveira";
		//end.rua=  "Orquideas 166";
		Cliente Pedro = new Cliente("Pedro", 26, "401.679.288-54", "Louveira", "Rua Orquideas", "Santo Antonio");
		
		Pedro.getEndereco();
         
	}

}
