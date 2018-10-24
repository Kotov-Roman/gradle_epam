package homework5.cashDispenser.utils;

/**
 * Atm implementation of the <tt>CashDispanser</tt> abstract class.  Implements
 * all optional  operations.
 */

public class ToyDispenser extends CashDispenser {

    /** Returns the cash account after replenishment.
     * @param money - the value that should not be null and should be more or equals to 0
     */
    @Override
    public void performAddMoney(double money) {
        System.out.println("cant do anything, im just a toy");
    }

    /** Returns the cash account after cash withdrawal.
     * @param money - the value that should not be null and should be more or equals to 0
     */
    @Override
    public void performWasteMoney(double money) {
        System.out.println("cant do anything, im just a toy");
    }

    /**
     * Display information about ATM
     */
    @Override
    public void display() {
        System.out.println("Iam a toy dispenser");
    }

    /**
     * Display information about imaginary cash account
     */
    @Override
    public void showBalance() {
        System.out.println("Your balance: 1000000000$");
    }
}
