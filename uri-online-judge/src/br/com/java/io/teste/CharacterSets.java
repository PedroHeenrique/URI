package br.com.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;

public class CharacterSets {

	public static void main(String[] args) throws UnsupportedEncodingException{
		// TODO Auto-generated method stub
		String formato = String.format(Locale.US,"%08.2f", 26.0);
		System.out.println(formato);
		//TRAZ O ENCONDIGN PADRAO USADO PELO SISTEMA OPERACIONAL
		Charset set = Charset.defaultCharset();
		System.out.println(set);
		
		//OBETEM O CODEPOINT DA LETRA NA POSICAO PASSADA NO PARAMETRO DO METODO
		String c = "a";
		System.out.println(c.codePointAt(0));
			
	    System.out.println(	Charset.defaultCharset());
	    
	    //QUANTIDADE DE BYTES QUE O ENCODING TRABALHA
	    byte []bytes = c.getBytes("windows-1252");
	    System.out.println(bytes.length);
	    
	    String snovo = new String (bytes,"windows-1252");
	    System.out.println(snovo);
	    
	    //FORÇAMOS O JAVA UTILIZAR OUTRO ENCODING
	    byte []bytes2 = c.getBytes("UTF-16");
	    System.out.println(bytes2.length + " UTF-16");
	    String snew = new String(bytes2,"UTF-16");
	    System.out.println(snew);
	    
	}

}
