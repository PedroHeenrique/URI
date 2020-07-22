package uri;

import java.io.IOException;
import java.util.Scanner;

public class CombinadorURI1238 {
  private static int combinacoesASeremFeitas = 0;
  private static int linha = 0;
  private static String[] palavrasParaCombinar;
  private static String[] resultadoDaCombinacao;
  private static String primeiraPalavraArray;
  private static String segundaPalavraArray;

  private static final int POSICAO_PRIMEIRA_PALAVRA = 0;
  private static final int POSICAO_SEGUNDA_PALAVRA = 1;

  public static void main(String[] args) throws IOException {
    int posicao = 0;
    String palavrasASeremCombinadas;
    Scanner entrada = new Scanner(System.in);

    combinacoesASeremFeitas = entrada.nextInt();
    inicializaArrayDePalavrasASeremCombinadas(combinacoesASeremFeitas);

    entrada.nextLine();
    while (posicao < combinacoesASeremFeitas) {

      palavrasASeremCombinadas = entrada.nextLine();
      guardaCasosTeste(palavrasASeremCombinadas, posicao);

      posicao++;
    }

    String combinacoesRealizadas[] = realizarCombinacao();
    for (int i = 0; i < combinacoesRealizadas.length; i++) {
      System.out.println(combinacoesRealizadas[i]);

    }
    
    entrada.close();
  }

  private static void inicializaArrayDePalavrasASeremCombinadas(int tamanho) {
    palavrasParaCombinar = new String[tamanho];
    resultadoDaCombinacao = new String[tamanho];

  }

  private static void guardaCasosTeste(String cadeiaCaracteres, int posicao) {
    palavrasParaCombinar[posicao] = cadeiaCaracteres;

  }

  private static String[] realizarCombinacao() {
    for (int i = 0; i < palavrasParaCombinar.length; i++) {
      String palavrasACombinar[] = palavrasParaCombinar[i].split(" ");
      separaPalavrasParaCombinar(palavrasACombinar);
      combinar();

      linha++;

    }

    return resultadoDaCombinacao;
  }

  private static void separaPalavrasParaCombinar(String[] palavras) {
    primeiraPalavraArray = palavras[POSICAO_PRIMEIRA_PALAVRA];
    segundaPalavraArray = palavras[POSICAO_SEGUNDA_PALAVRA];
  }

  private static void combinar() {
    int limiteMaiorPalavra = obterTamanhoDaMaiorPalavraASerPercorrida();
    StringBuilder guardaCombinacao = new StringBuilder();

    for (int indice = POSICAO_PRIMEIRA_PALAVRA; indice < limiteMaiorPalavra; indice++) {

      if (indice < primeiraPalavraArray.length())
        guardaCombinacao.append(primeiraPalavraArray.charAt(indice));

      if (indice < segundaPalavraArray.length())
        guardaCombinacao.append(segundaPalavraArray.charAt(indice));

    }

    resultadoDaCombinacao[linha] = guardaCombinacao.toString();

  }

  private static int obterTamanhoDaMaiorPalavraASerPercorrida() {
    if (primeiraPalavraArray.length() == segundaPalavraArray.length())
      return primeiraPalavraArray.length();

    if (primeiraPalavraArray.length() > segundaPalavraArray.length())
      return primeiraPalavraArray.length();

    else
      return segundaPalavraArray.length();

  }

}