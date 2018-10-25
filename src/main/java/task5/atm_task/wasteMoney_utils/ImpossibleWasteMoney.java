package task5.atm_task.wasteMoney_utils;

import java.math.BigDecimal;

/**
 *  Part of implementation of pattern Strategy
 */

public class ImpossibleWasteMoney implements WasteMoneyBehavior {
    @Override
    public BigDecimal removeMoney(double amount) {
        System.out.println("Impossible to waste money");
        return new BigDecimal(0);
    }
}
