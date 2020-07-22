package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtalhosBloggoURI1239 {
  
  private static char fraseLida[] = new char[50];

  public static void main(String[] args) throws IOException {

    try (BufferedReader leituraTeclado = new BufferedReader(new InputStreamReader(System.in))) {

      leituraTeclado.read(fraseLida);
   
      
    } catch (ArrayIndexOutOfBoundsException error) {
      throw new ArrayIndexOutOfBoundsException("Fora dos limites do array");

    }
  }

}
