package task5.atm_task.addMoney_utils;

import java.math.BigDecimal;

/**
 *  Part of implementation of pattern Strategy
 */

public class PossibleAddMoney implements AddMoneyBehavior {
    @Override
    public BigDecimal addMoney(double amount) {
        return new BigDecimal(amount);
    }
}
