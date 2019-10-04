public class Carta {

    private final String numero_carta;
    private final String naipe;

    public Carta(String numero_carta, String naipe) {
        this.numero_carta = numero_carta;
        this.naipe = naipe;
    }

    public String toString()
    {
        return  numero_carta + " de " + naipe;
    }

}
