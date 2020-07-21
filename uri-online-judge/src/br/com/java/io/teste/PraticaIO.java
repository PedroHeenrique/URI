package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PraticaIO {

	public static void main(String[] args) {
		InputStream abre = null;
		
		InputStreamReader ler = null;
		OutputStreamWriter gravarEm =null;
		
		BufferedReader gravar = null;
		BufferedReader lerFrase = null;
		BufferedWriter escreve = null;
		try {
			abre = new FileInputStream("C:\\Users\\Pichau\\Desktop\\Copia.txt");
			ler = new InputStreamReader(abre);
			lerFrase = new BufferedReader(ler);
			
			

			String linha = lerFrase.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = lerFrase.readLine();
			}
			
			gravarEm = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Pichau\\Desktop\\Copia2.txt"));
		

		} catch (IOException exc) {
			System.out.println("Um erro nao esperado ococrreu");
		} finally {
			try {
				if (ler != null)
					ler.close();
				if (lerFrase != null)
					lerFrase.close();

			} catch (IOException ex) {
				System.out.println("Erro ao fechar o arquivo");
			}

		}
	}

}
