package tdd;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<Account>();
    private int noOfCustomers;


    public void addCustomer(String firstName, String lastName, String phoneNumber, String pin) {
        Account account = new Account(firstName, lastName, generateAccountNo(phoneNumber), pin);
        accounts.add(account);
        noOfCustomers++;
    }

    private String generateAccountNo(String phoneNumber) {
        return phoneNumber.substring(1);
    }

    public int checkNooFCustomers() {

        return noOfCustomers;
    }

    public void deposit(String accountNo, double amount) {
        Account account = findAccount(accountNo);
        account.deposit(amount);
    }

    private Account findAccount(String accountNo) {
        for (Account account : accounts) {
            if (account.checkAccountNumber().equals(accountNo)) {
                return account;
            }
        }
        return null;
    }

    public double checkBalance(String pin, String accountNumber) {
        Account account = findAccount(accountNumber);
        return account.checkBalance(pin);

    }

    public void withdraw(String accountNo, double amount, String pin) {
        Account account = findAccount(accountNo);
        account.withdraw(amount, pin);
    }

    public void transfer(String accountNo, String receiverAccountNor, double amount, String pin) {
        Account account = findAccount(accountNo);
        account.withdraw(amount, pin);
        Account receiverAccount = findAccount(receiverAccountNor);
        receiverAccount.deposit(amount);
    }
}