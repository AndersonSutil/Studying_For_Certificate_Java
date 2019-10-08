package Patterns.Strategy;

public class ISS implements Imposto {


    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 6 / 100;
    }
}
