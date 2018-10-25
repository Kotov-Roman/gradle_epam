package task5.atm_task.wasteMoney_utils;

/**
 *  Part of implementation of pattern Strategy
 */

public class PossibleWasteMoney implements WasteMoneyBehavior {
    @Override
    public double removeMoney(double amount) {
        return amount;
    }
}
