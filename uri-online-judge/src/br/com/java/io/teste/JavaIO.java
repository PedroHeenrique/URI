package br.com.java.io.teste;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class JavaIO {
	public static void main(String[] args)throws IOException {
		
	    InputStream fis = new FileInputStream("IO.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader buff = new BufferedReader(isr);
		
		String linha = buff.readLine();
		while(linha != null) {
		System.out.println(linha);
		linha= buff.readLine();
		}
		buff.close();
	
	}

}
