package tdd;

public class Account {
    private String accountNumber;
    private String firstName;
    private String lastName;
    private String pin;
    private double balance;

    public Account(String firstName, String lastName, String accountNumber, String pin) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.balance = 0;
    }
    private boolean checkPin(String pin) {
        return this.pin .equalsIgnoreCase(pin);
    }

    public double checkBalance(String pin) {
        if(checkPin(pin)) {
            return balance;
        }
        return 0;
    }

    public String checkAccountNumber() {
        return accountNumber;
    }
    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
        }
    }
    public void withdraw(double amount, String pin) {
        if (amount < this.balance && amount > 0 &&  checkPin(pin)) {
            this.balance -= amount;
        }
    }
}
