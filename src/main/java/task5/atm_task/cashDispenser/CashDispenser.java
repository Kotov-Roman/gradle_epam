package task5.atm_task.cashDispenser;

import com.sun.istack.internal.NotNull;
import task5.atm_task.CustomerAccount;
import task5.atm_task.addMoney_utils.AddMoneyBehavior;
import task5.atm_task.wasteMoney_utils.WasteMoneyBehavior;

/**
 * Abstract implementation of CashDispenser. Determines all basic methods.
 * Have implementation of pattern Strategy
 */

public abstract class CashDispenser {
    CustomerAccount customerAccount;
    AddMoneyBehavior addMoneyBehavior;
    WasteMoneyBehavior wasteMoneyBehavior;

    /**
     * Returns the cash account after replenishment.
     * @param money - the value that should not be null and should be more or equals to 0
     */
    public abstract void performAddMoney(@NotNull double money);

    /**
     * Returns the cash account after cash withdrawal.
     * @param money - the value that should not be null and should be more or equals to 0
     */
    public abstract void performWasteMoney(@NotNull double money);

    /**
     * Display information about ATM
     */
    public abstract void display();

    /**
     * Display information about cash account
     */
    public void showBalance() {
        System.out.println("Current balance: " + customerAccount.getMoney());
    }

    /**
     * Establish dependency between CashDispenser and Customers's cash account
     */
    public void setCustomerAccount(CustomerAccount customerAccount) {
        this.customerAccount = customerAccount;
    }
}
