package Learning_the_Java_Language;

import javax.crypto.spec.PSource;

public class EscopoDeVariaveis {
    public void m1() {
        int x = 10;
        if (x >= 10) {
            int y = 50;      // <-- variavel só pode ser acessado dentro do bloco {}
            System.out.println(y);
        }
        System.out.println(x);
    }
    public void m2(String nome){ // <-- passsando o parametro nome
        System.out.println(nome);
    }


    public static void main(String[] args) {
        EscopoDeVariaveis esvar = new EscopoDeVariaveis();
        esvar.m1();
        esvar.m2("Anderson Sutil");
    }
}
