package br.com.java.io.teste;



import java.io.Writer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class JavaEscrita3 {
	public static void main(String[] args) throws IOException {

		/*OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);**/
		
		 
		//BufferedWriter buffer = new BufferedWriter(new FileWriter("C:\\Users\\Pichau\\Desktop\\Motivacao.txt"));
         PrintStream ps = new PrintStream("C:\\Users\\Pichau\\Desktop\\Motivacao.txt");
         // vai fazer impressão onde      /^
         ps.println("Eu aprendeo muito rapido e gravo coteudos importantes facilmente");
         
		/*buffer.write("Eu sou determinação, eu sou inteligencia, eu sou motivação, eu sou feliz, eu sou realizado,");
	    buffer.write(System.lineSeparator());
		buffer.write("Eu sou prosperidade, Eu sou Alegria");
		buffer.write(System.lineSeparator());
		buffer.write("Eu sou capaz, eu sou autoconfiança, eu sou coragem, Eu sou amor");
		buffer.write(System.lineSeparator());
		buffer.write("Jeova Deus Me ama infinitamente e eu sinto isso todos os dias de minha vida" .toUpperCase());
		buffer.flush();**/
		
		ps.close();

		

	}

}
