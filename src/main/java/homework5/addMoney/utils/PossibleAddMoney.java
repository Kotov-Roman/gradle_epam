package homework5.addMoney.utils;

/**
 *  Part of implementation of pattern Strategy
 */

public class PossibleAddMoney implements AddMoneyBehavior {
    @Override
    public double addMoney(double amount) {
        return amount;
    }
}
