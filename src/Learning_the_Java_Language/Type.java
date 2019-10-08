package Learning_the_Java_Language;


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
         System.out.println(sc.nextLine());//<-- puxa a proxima linha assim ignorando o Delimiter
         System.out.println(sc.locale());//<-- puxa a localidade do scanner
         sc.reset(); //<-- reset no sacanner
         System.out.println("\nApartir do reset\n");
         sc = new Scanner(input);
         System.out.println(sc.nextLine());
         sc.close(); //<-- close fecha o Scanner sc


    }
}
