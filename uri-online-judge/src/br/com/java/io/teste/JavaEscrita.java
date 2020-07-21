package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class JavaEscrita {

	public static void main(String[] args) throws IOException{
		
		InputStream arquivoEntrada = null;
		Reader transforma;
		BufferedReader buffer;
		
		try {
			
		arquivoEntrada = new FileInputStream("C:\\Users\\Pichau\\Desktop\\Motivacao.txt");
		transforma = new InputStreamReader(arquivoEntrada);
		buffer = new BufferedReader(transforma);
		
		String linha = buffer.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = buffer.readLine();
			
		}
		 	
		System.out.println();
				
		}
		catch(FileNotFoundException exc) {
		   System.out.println("Não foi possivel localizar o arquivo");	
		
		}
		
	     finally {
	    	 
	    	 try {
	    		 
	    		 arquivoEntrada.close();
	    		 System.out.println("Fechamento realizado com sucesso");
	    		 
	 		} catch (IOException erro) {
	 			System.out.println("Não foi possivel fechar o arquivo");
	 		}
	     }
			
		
		FileOutputStream escreverEm = new FileOutputStream("C:\\Users\\Pichau\\Desktop\\Motivacao.txt");
		OutputStreamWriter escreve = new OutputStreamWriter(escreverEm);
		BufferedWriter ler = new BufferedWriter(escreve);
		
		ler.write("Eu sou extremantemnte inteligente e determinado");
		ler.close();		 
			
			
		

	}

}
