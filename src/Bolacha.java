public class Bolacha {



    public static void main(String[] args) {
//        System.out.println("Não se sabe");
//
//        int [] resposta ={4,2,3,4,5,6,7,8,1,23,3,14,3,3,12,21,34,13,21,21};
//        int [] frequencia = new int [15];
//
//
//
//        for(int responda = 0; responda<resposta.length;responda++)
//        {
//             try {
//                ++frequencia[resposta[responda]];
//            }catch (ArrayIndexOutOfBoundsException e)
//            {
//                System.out.println(e);
//                System.out.printf("    resposta[%d] = %d%n%n",
//                        responda, resposta[responda]);
//            }
//        }
//        System.out.printf("%s%10s%n","Avaliação","Frequencia");
//
//        for (int avaliação = 1; avaliação< frequencia.length; avaliação++)
//            System.out.printf("%6d%10d%n",avaliação,frequencia[avaliação]);

        Baralho_de_Cartas novoBaralho = new Baralho_de_Cartas();
        novoBaralho.embaralhar();

            for (int i = 1; i <= 52; i++)
                {
                    System.out.printf("%-20s", novoBaralho.cartadeAcordo());

                    if (i % 3 == 0)
                        System.out.println();
                }
        }
}
