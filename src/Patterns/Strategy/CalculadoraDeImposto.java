package Patterns.Strategy;

public class CalculadoraDeImposto {
    public static void main(String[] args) {

        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Orcamento or = new Orcamento(500.0);

        calcular(or,icms);
        calcular(or,iss);
    }

    static void calcular(Orcamento orcamento, Imposto imposto){
        System.out.println(imposto.calcular(orcamento));
    }
}
