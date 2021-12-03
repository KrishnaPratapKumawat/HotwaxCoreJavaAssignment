package SimulatesBank;

public class AccountOverDrawDemo extends Account implements Runnable {
    private Account account;

    public AccountOverDrawDemo(Account account) {
        this.account = account;
    }

    public void run() {

        for (int i = 0; i <= 1; i++) {

            try {
                accountOverDrawDemoSafeDemo();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (account.getBalance() < 0) {
                System.out.println();
                System.out.println("Account Is Overdraw !");
            }
        }
    }

    private void accountOverDrawDemoSafeDemo() {
        try {
            if (account.getBalance() >= 500) {
                System.out.println();
                System.out.println(Thread.currentThread().getName() + ": With Draw Amount :-" + 500);
                System.out.println();
                Thread.sleep(1000);
                account.withDraw(500);
                System.out.println();
                System.out.println(Thread.currentThread().getName() + ": Your Transaction Succesful :-" + 500);
            } else {
                System.out.println();
                System.out.println("your Current Balance is :-" + account.getBalance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


