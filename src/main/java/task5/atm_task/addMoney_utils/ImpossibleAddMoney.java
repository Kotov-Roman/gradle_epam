package task5.atm_task.addMoney_utils;

import java.math.BigDecimal;

/**
 *  Part of implementation of pattern Strategy
 */

public class ImpossibleAddMoney implements AddMoneyBehavior {
    @Override
    public BigDecimal addMoney(double amount) {
        System.out.println("impossible to add money from this CashDispanser");
        return new BigDecimal(0);
    }
}
