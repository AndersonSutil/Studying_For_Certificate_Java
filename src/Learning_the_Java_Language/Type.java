package Learning_the_Java_Language;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Type
{
    public static void main(String[] args)
    {
        //Estudo das classes do java Util e seus metodos

         String input ="1 pula --> corta  " +
                 " O Primeiro azul peixe 2" +
                 " corta <-- pula O segundo peixe azul " +
                 "corta <-- pula O terceiro  vermelho peixe corta <-- pula azul peixe corta";
         Scanner sc = new Scanner (input).useDelimiter("\\s*corta\\s*"); //<--useDelimiter usa aonde cara parte de sc tem que
                                                                         // para utilizar no inicio e no final de cada chamada
         System.out.println(sc.next());
         System.out.println(sc.next());
         System.out.println(sc.next());
         System.out.println(sc.next());
         sc.close(); //<-- close fecha o Scanner sc



    }
}
