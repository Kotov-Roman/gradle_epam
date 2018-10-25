package task5.atm_task.wasteMoney_utils;

import com.sun.istack.internal.NotNull;

import java.math.BigDecimal;

/**
 * Part of implementation of pattern Strategy
 */

public interface WasteMoneyBehavior {
    BigDecimal removeMoney(@NotNull double amount);
}
