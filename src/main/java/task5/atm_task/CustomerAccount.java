package task5.atm_task;

import java.math.BigDecimal;

/**
 * CustomerAccount class. Contains cash account and methods to work with it.
 */
public class CustomerAccount {

    /**
     * The cash account.
     */
    private volatile BigDecimal money;

    public CustomerAccount(double deposit) {
        money = new BigDecimal(deposit);
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
