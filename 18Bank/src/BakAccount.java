import java.math.BigDecimal;

public class BakAccount {
    String name;
    BigDecimal balance;
    boolean hasOverdraft;
    public BigDecimal withDraw(BigDecimal amount){
        this.balance=this.balance.subtract(amount);
        return this.balance;

    }
}
