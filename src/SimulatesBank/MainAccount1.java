package SimulatesBank;

public class MainAccount {
    public static void main(String[] args) {
        Account acc = new Account();
        AccountOverDrawDemo aod = new AccountOverDrawDemo(acc);
        Thread t1 = new Thread(aod);
        Thread t2 = new Thread(aod);
        t1.setName("Gaurav");
        t2.setName("Mehul");
        t1.start();
        t2.start();
    }
}
