package Patterns.Strategy;

public class ICMS implements Imposto {


    @Override
    public double calcular(Orcamento orcamento) {
        return (orcamento.getValor() * 5) / 100 + 50;
    }
}
