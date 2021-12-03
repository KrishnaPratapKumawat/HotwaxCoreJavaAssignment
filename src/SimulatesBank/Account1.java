package SimulatesBank;

public class Account {

    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void withDraw(int amount) {
        balance = balance - amount;
    }

}

