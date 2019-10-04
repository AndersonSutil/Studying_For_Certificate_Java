import java.security.SecureRandom;

public class Baralho_de_Cartas {

    private Carta[] baralho;
    private int carta_atual;
    private static final int NUMERO_DE_CARTAS = 52;

    private static final SecureRandom numerosAleatorios = new SecureRandom();

    public Baralho_de_Cartas()
    {
        String[] numero_carta = {"A","2","3","4","5","6","7","8","9","10","Q","J","K"};
        String[] naipes = {"Ouro","Espada","Copas","Paus"};

        baralho = new Carta[NUMERO_DE_CARTAS];
        carta_atual=0;

        for (int conta = 0; conta < baralho.length; conta++)
            baralho[conta] =
                    new Carta(numero_carta[conta % 13],naipes[conta / 13]);
    }

    public void embaralhar()
    {
        carta_atual = 0;

        for(int primeiro = 0; primeiro < baralho.length; primeiro++)
        {

            int segundo = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);

            Carta tem = baralho[primeiro];
            baralho[primeiro] = baralho [segundo];
            baralho[segundo] = tem;
        }
    }

    public Carta cartadeAcordo()
    {

        if (carta_atual < baralho.length)
            return  baralho[carta_atual++];
            else
                return null;
    }
}

