package homework5.addMoney.utils;

/**
 *  Part of implementation of pattern Strategy
 */

public class ImpossibleAddMoney implements AddMoneyBehavior {
    @Override
    public double addMoney(double amount) {
        System.out.println("impossible to add money from this CashDispanser");
        return 0;
    }
}
