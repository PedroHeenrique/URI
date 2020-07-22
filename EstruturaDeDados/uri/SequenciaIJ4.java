package uri;

import java.util.Formatter;
import java.util.IllegalFormatException;

public class SequenciaIJ4 {

  /*
   * VOCÊ DEVE FAZER UM PROGRAMA QUE APRESENTE A SEQUENCIA CONFORME O EXEMPLO
   * ABAIXO.
   * 
   * ENTRADA NÃO HÁ NENHUMA ENTRADA NESTE PROBLEMA.
   * 
   * SAÍDA IMPRIMA A SEQUENCIA CONFORME EXEMPLO ABAIXO.
   * 
   * I=0 J=1 I=0 J=2 I=0 J=3 I=0.2 J=1.2 I=0.2 J=2.2 I=0.2 J=3.2 ..... I=2 J=? I=2
   * J=? I=2 J=?
   */

  public static void main(String args[]) {

    Formatter saida = new Formatter();

    String primeira = null;
    String segunda = null;
    String terceira = null;
    int jotaExecutadoTotalmenteQuantasVezes = 1;

    try {

      for (int i = 0; i < 3;) {
        for (int j = 1; j < 4; j++) {

          if (jotaExecutadoTotalmenteQuantasVezes == 1)
            primeira = saida.format("I=%d J=%d %n", i, j).toString();

          if (jotaExecutadoTotalmenteQuantasVezes == 2)
            segunda = saida.format("I=%d%c%d j=%d%c%d%n", i, '.', jotaExecutadoTotalmenteQuantasVezes, j, '.',
                jotaExecutadoTotalmenteQuantasVezes).toString();

          if (jotaExecutadoTotalmenteQuantasVezes == 3)
            terceira = saida.format("I=%d%c%d j=%d%c%d%n", i, '.', jotaExecutadoTotalmenteQuantasVezes, j, '.',
                jotaExecutadoTotalmenteQuantasVezes).toString();

        }

        jotaExecutadoTotalmenteQuantasVezes++;

        if (jotaExecutadoTotalmenteQuantasVezes == 3) {

          i++;
          jotaExecutadoTotalmenteQuantasVezes = 0;
        }
      }

      System.out.println(primeira);
      /**System.out.println(segunda);
      System.out.println(terceira);*/

    } catch (IllegalFormatException e) {
        System.out.print("Algumento passado esta incorreto");

    } finally {
        saida.close();
    }

  }

}
