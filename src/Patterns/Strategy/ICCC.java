package Patterns.Strategy;

public class ICCC implements Imposto {
    @Override
    public double calcular(Orcamento orcamento) {
        if (orcamento.getValor() < 1000) {
            return orcamento.getValor() * 5 / 100;
        } else if (orcamento.getValor() <= 3000) {
            return orcamento.getValor() * 7 / 100;
        } else return (orcamento.getValor() * 8) / 100 + 30;
    }
}
