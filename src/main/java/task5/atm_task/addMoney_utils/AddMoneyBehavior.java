package task5.atm_task.addMoney_utils;

import com.sun.istack.internal.NotNull;

/**
 *  Part of implementation of pattern Strategy
 */

public interface AddMoneyBehavior {
    double addMoney(@NotNull double amount);
}
