package tdd;

public class Account {
    private int balance;
    public int checkingBalance(String pin) {
        return this.balance;
    }
    public void deposit(String pin, int amount) {
        this.balance += amount;
    }
    public void withdraw(String pin, int amount) {
        if (this.balance >= amount) {
            balance -= amount;
        }
    }

}
