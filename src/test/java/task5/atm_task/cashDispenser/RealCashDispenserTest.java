package task5.atm_task.cashDispenser;

import org.junit.Before;
import org.junit.Test;
import task5.atm_task.CustomerAccount;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class RealCashDispenserTest {
    private CustomerAccount account;
    private CashDispenser realCashDispenser ;

    @Before
    public void set() {
        account = new CustomerAccount(12000);
        realCashDispenser = new RealCashDispenser();
        realCashDispenser.setCustomerAccount(account);
    }

    @Test
    public void performAddMoney() {
        realCashDispenser.performAddMoney(1000);
        assertTrue (account.getMoney().compareTo(new BigDecimal(13000))==0);

        for (int i = 0; i <10000 ; i++) {
            realCashDispenser.performAddMoney(1);
        }
        assertTrue (account.getMoney().compareTo(new BigDecimal(23000))==0);

    }

    @Test
    public void performWasteMoney() {
        realCashDispenser.performWasteMoney(1000);
        assertTrue (account.getMoney().compareTo(new BigDecimal(11000))==0);

        for (int i = 0; i <10000 ; i++) {
            realCashDispenser.performWasteMoney(1);
        }
        assertTrue (account.getMoney().compareTo(new BigDecimal(1000))==0);
    }
}