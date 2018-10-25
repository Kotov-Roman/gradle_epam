package task5.atm_task.wasteMoney_utils;

/**
 *  Part of implementation of pattern Strategy
 */

public class ImpossibleWasteMoney implements WasteMoneyBehavior {
    @Override
    public double removeMoney(double amount) {
        System.out.println("Impossible to waste money");
        return 0;
    }
}
