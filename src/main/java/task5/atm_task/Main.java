package task5.atm_task;

import task5.atm_task.cashDispenser.CashDispenser;
import task5.atm_task.cashDispenser.RealCashDispenser;

public class Main {
    public static void main(String[] args) {
        CustomerAccount account = new CustomerAccount(50);
        CashDispenser realCashDispenser = new RealCashDispenser();
        realCashDispenser.setCustomerAccount(account);
        realCashDispenser.performWasteMoney(50);
        System.out.println(account.getMoney());

        Runnable runnableAdd = () -> realCashDispenser.performAddMoney(1);
        Runnable runnableWaste = () -> realCashDispenser.performWasteMoney(1);

        for (int i = 0; i < 10000 ; i++) {
            Thread thread0 = new Thread(runnableAdd);
            thread0.start();
        }

        for (int i = 0; i < 10000; i++) {
            Thread threadWaste1 = new Thread(runnableWaste);
            threadWaste1.start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("right now:");
        realCashDispenser.showBalance();

    }
}
