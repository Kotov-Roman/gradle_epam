package task5.atm_task.cashDispenser;

import task5.atm_task.addMoney_utils.PossibleAddMoney;
import task5.atm_task.wasteMoney_utils.PossibleWasteMoney;

import java.math.BigDecimal;

/**
 * Atm implementation of the <tt>CashDispenser</tt> abstract class.  Implements
 * all optional  operations.
 */

public class RealCashDispenser extends CashDispenser {

    public RealCashDispenser() {
        addMoneyBehavior = new PossibleAddMoney();
        wasteMoneyBehavior = new PossibleWasteMoney();
    }

    /**
     * Returns the cash account after replenishment.
     *
     * @param money - the value that should not be null and should be more or equals to 0
     */
    @Override
    public synchronized void performAddMoney(double money) {
        BigDecimal result = customerAccount.getMoney().add(addMoneyBehavior.addMoney(money));
        customerAccount.setMoney(result);
        System.out.println("You added: " + money);
        showBalance();
    }

    /**
     * Returns the cash account after cash withdrawal.
     *
     * @param money - the value that should not be null and should be more or equals to 0
     */
    @Override
    public synchronized void performWasteMoney(double money) {
        if (customerAccount.getMoney().compareTo(new BigDecimal(money)) >= 0) {
            BigDecimal result = customerAccount.getMoney().subtract(wasteMoneyBehavior.removeMoney(money));
            customerAccount.setMoney(result);
            System.out.println("You wasted: " + money);
            showBalance();
        } else {
            System.out.println("Not enough money :(");
        }
    }

    /**
     * Display information about ATM
     */
    @Override
    public void display() {
        System.out.println("Iam real ATM");
    }
}
