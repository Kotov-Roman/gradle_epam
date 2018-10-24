package homework5.wasteMoney.utils;

/**
 *  Part of implementation of pattern Strategy
 */

public class PossibleWasteMoney implements WasteMoneyBehavior {
    @Override
    public double removeMoney(double amount) {
        return amount;
    }
}
