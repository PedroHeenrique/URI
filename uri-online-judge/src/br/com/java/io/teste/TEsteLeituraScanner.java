package br.com.java.io.teste;

import java.util.Locale;
import java.util.Scanner;

import java.io.File;
import java.io.FileInputStream;


public class TEsteLeituraScanner {

	public static void main(String[] args)throws Exception {
	 
		Scanner scanner = new Scanner(new File("contas.csv"));
	    scanner.useLocale(Locale.JAPAN);
        while (scanner.hasNextLine()) {
        	String linha = scanner.nextLine();
            
        	//String donoConta[] = linha.split(",");
        	//System.out.println(donoConta[3]);
        	System.out.println(linha);
        	
      

            Scanner outro = new Scanner(linha);
            outro.useDelimiter(",");
            String palavra = outro.next();
            System.out.println(palavra);
		}
        
          
		
		scanner.close();
	}

}
