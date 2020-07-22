package uri;

import java.util.Scanner;

public class TempoDeJogoURI1046 {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    String inicioEFimJogo;
    int duracao = 0;

    try {
      inicioEFimJogo = entrada.nextLine();

      String inicioEFim[] = inicioEFimJogo.split(" ");
      int inicioJogo = Integer.parseInt(inicioEFim[0]);
      int fimJogo = Integer.parseInt(inicioEFim[1]);

      if (inicioJogo == fimJogo)
        duracao = 24;

      if (inicioJogo > fimJogo) 
        duracao = (24 - inicioJogo) + fimJogo;

      if (inicioJogo < fimJogo) 
        duracao = fimJogo - inicioJogo;
     
      System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

    } finally {
        entrada.close();
    }

  }

}
