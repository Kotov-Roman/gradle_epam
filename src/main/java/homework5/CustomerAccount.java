package homework5;

/**
 * CustomerAccount class. Contains cash account and methods to work with it.
 */
public class CustomerAccount {

    /**
     * The cash account.
     */
    private volatile double money;

    CustomerAccount(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
