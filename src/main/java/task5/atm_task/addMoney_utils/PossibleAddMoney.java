package task5.atm_task.addMoney_utils;

/**
 *  Part of implementation of pattern Strategy
 */

public class PossibleAddMoney implements AddMoneyBehavior {
    @Override
    public double addMoney(double amount) {
        return amount;
    }
}
