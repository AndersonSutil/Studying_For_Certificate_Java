package Learning_the_Java_Language;

public class Manipulation_Arrays {

    public static void main(String[] args) {
        int[] array ={1,2,3,4,5};
        System.out.printf("%n%n manipulação de arrays %n%n " +
                "Os Valores Originais do array são:%n");
        for(int value : array)
            System.out.printf("    %d",value);

        modifyArray(array);
        System.out.printf("%n%n Os valores modificados do array são:%n");
        for (int value:array)
            System.out.printf("     %d",value);

        System.out.printf("%n%nPassando o elemento%n%n",array[3]);

        modifyElemento(array[3]);
        System.out.printf("%n%nArray depois de ser modificado%n%n ", array[3]);

    }
        public static void modifyArray(int [] array2 )
        {
            for(int counter=0;counter < array2.length;counter++ )
                array2[counter] *= 2;
        }

        public static void modifyElemento(int element)
        {
            element *= 2;
            System.out.printf("%n%nValor do elementomodigicado%n%n",element);
        }

}
