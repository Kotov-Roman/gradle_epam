package task5.atm_task.wasteMoney_utils;

import java.math.BigDecimal;

/**
 *  Part of implementation of pattern Strategy
 */

public class PossibleWasteMoney implements WasteMoneyBehavior {
    @Override
    public BigDecimal removeMoney(double amount) {
        return new BigDecimal(amount);
    }
}
