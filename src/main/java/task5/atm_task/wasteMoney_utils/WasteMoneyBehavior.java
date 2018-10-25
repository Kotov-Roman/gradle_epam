package task5.atm_task.wasteMoney_utils;

import com.sun.istack.internal.NotNull;

/**
 * Part of implementation of pattern Strategy
 */

public interface WasteMoneyBehavior {
    double removeMoney(@NotNull double amount);
}
