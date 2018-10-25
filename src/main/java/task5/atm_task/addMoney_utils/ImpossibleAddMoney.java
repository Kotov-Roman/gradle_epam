package task5.atm_task.addMoney_utils;

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
