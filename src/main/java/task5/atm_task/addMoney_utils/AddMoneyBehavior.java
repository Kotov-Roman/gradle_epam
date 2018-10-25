package task5.atm_task.addMoney_utils;

import com.sun.istack.internal.NotNull;

import java.math.BigDecimal;

/**
 *  Part of implementation of pattern Strategy
 */

public interface AddMoneyBehavior {
    BigDecimal addMoney(@NotNull double amount);
}
