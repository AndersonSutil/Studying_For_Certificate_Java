package Learning_the_Java_Language;
import java.math.BigDecimal;

public class Money {
    //Tratamendo de dinheiro se usar BigDecimal
    public BigDecimal money;
    public Money(BigDecimal money) { this.money = money; }
    public BigDecimal getMoney() { return money; }
    public void setMoney(BigDecimal money) { this.money = money; }


    public static void main(String[] args) {
        Money money = new Money(BigDecimal.valueOf(122000.00));

        System.out.println("O Valor :"+money.getMoney());
    }

}
