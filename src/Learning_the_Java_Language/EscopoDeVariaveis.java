package Learning_the_Java_Language;

class VariavelStatica{
    static int id = 1 ;  // <--  variáveis estáticas podem ser acessadas através de qualquer escopo


    public static void setId(int id){  // <-- shadowing
        VariavelStatica.id = id; // <-- forçando a acessar a variavel de classe
        id = 50;
        System.out.println(id);
    }
    int y = 0;
    public void setY(int y){        // <-- shadowing
        this.y = y;
        y = 20;
        System.out.println(y);
        // <-- forçando acessar o variavel de instância
    }
    public void ImprimeValores(){
        System.out.println(y);
        System.out.println(id);
    }


}

public class EscopoDeVariaveis {
    String nome1;  // <-- Variavel de istancia, Atributo

    public void m1() {
        int x = 10;
        if (x >= 10) {
            int y = 50;      // <-- variavel local, só pode ser acessado dentro do bloco {}
            System.out.println(y);
        }
        System.out.println(x);
    }
    public void m2(String nome){ // <-- variavel local, passsando o parametro nome
        System.out.println(nome);
    }


    public static void main(String[] args) {
        EscopoDeVariaveis esvar = new EscopoDeVariaveis();

        VariavelStatica varsta = new VariavelStatica();


        esvar.m1();
        esvar.m2("Anderson");
        esvar.nome1 = "Sutil";
        System.out.println(esvar.nome1);


        System.out.println(varsta.id); // <-- acessando via referencia de instancia
        System.out.println(VariavelStatica.id);

        varsta.setY(12);  // <-- setando valores
        varsta.setId(12); // <-- print da força dos valores
        varsta.ImprimeValores(); //<-- imprimindo valores setados



    }
}
