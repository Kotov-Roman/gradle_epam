package homework5.wasteMoney.utils;

import com.sun.istack.internal.NotNull;

/**
 * Part of implementation of pattern Strategy
 */

public interface WasteMoneyBehavior {
    double removeMoney(@NotNull double amount);
}
