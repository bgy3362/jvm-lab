package thread_lab;

import static thread_lab.ThreadUtils.log;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccountV1(1000);

        Thread t1 = new Thread(new WithdrawTask(account, 800), "t1");
        Thread t2 = new Thread(new WithdrawTask(account, 800), "t2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        log("현재 잔액: " + account.getBalance());

    }
}
