package br.com.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class JavaCopiaarq {
	public static void main(String[] args) throws IOException {

		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader buff = new BufferedReader(isr);

		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("Eu sou determinação, eu sou inteligencia, eu sou motivação, eu sou feliz, eu sou realizado,");

		bw.newLine();
		bw.write("Eu sou prosperidade, Eu sou Alegria");

		String linha = buff.readLine();
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			linha = buff.readLine();
		}
		bw.close();
		buff.close();

	}

}
