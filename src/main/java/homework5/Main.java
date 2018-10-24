package homework5;

import homework5.cashDispenser.utils.CashDispenser;
import homework5.cashDispenser.utils.RealCashDispenser;

public class Main {
    public static void main(String[] args) {
        CustomerAccount account = new CustomerAccount(0);
        CashDispenser realCashDispenser = new RealCashDispenser();
        realCashDispenser.setCustomerAccount(account);

        Runnable runnableAdd = () -> realCashDispenser.performAddMoney(1000);
        Runnable runnableWaste = () -> realCashDispenser.performWasteMoney(1000);
        Thread thread0 = new Thread(runnableAdd);
        thread0.start();
        Thread thread1 = new Thread(runnableAdd);
        thread1.start();
        Thread thread2 = new Thread(runnableAdd);
        thread2.start();
        Thread thread3 = new Thread(runnableAdd);
        thread3.start();

        Thread threadWaste1 = new Thread(runnableWaste);
        threadWaste1.start();
        Thread threadWaste2 = new Thread(runnableWaste);
        threadWaste2.start();
        Thread threadWaste3 = new Thread(runnableWaste);
        threadWaste3.start();
        Thread threadWaste4 = new Thread(runnableWaste);
        threadWaste4.start();
        Thread threadWaste5 = new Thread(runnableWaste);
        threadWaste5.start();
        Thread threadWaste6 = new Thread(runnableWaste);
        threadWaste6.start();
        Thread threadWaste7 = new Thread(runnableWaste);
        threadWaste7.start();



    }
}
