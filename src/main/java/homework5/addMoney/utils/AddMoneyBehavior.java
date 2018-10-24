package homework5.addMoney.utils;

import com.sun.istack.internal.NotNull;

/**
 *  Part of implementation of pattern Strategy
 */

public interface AddMoneyBehavior {
    double addMoney(@NotNull double amount);
}
