package tdd;

import java.util.Scanner;

public class AtmMachine {
    private static Bank unionBank = new Bank();
    public static void main(String[] args) {
        goToMainMenu();
    }

    private static void goToMainMenu() {
        String bankMenu = """
                Welcome to the ATM Machine.
                1. Create account.
                2. deposit
                3. Withdraw
                4. transfer
                5. Check Balance
                6. Exit
                """;
        char inputForMainMenu = collectInput(bankMenu).charAt(0);
        switch (inputForMainMenu) {
            case '1' -> createAccount();
            case '2' -> deposit();
            case '3' -> withdraw();
            case '4' -> transfer();
            case '5' -> checkBalance();
            case '6' -> exit();
            default -> goToMainMenu();
        }
    }

    private static void exit() {
        System.exit(0);
    }

    private static void createAccount() {
        String firstName = collectInput("Enter first name: ");
        String lastName = collectInput("Enter last name: ");
        String pin = collectInput("Enter pin: ");
        String phoneNumber = collectInput("Enter phone Number: ");
        unionBank.addCustomer(firstName,lastName,pin,phoneNumber);
        goToMainMenu();
    }
    private static void deposit() {
        String accountNumber = collectInput("Enter account Number: ");
        double amount = Double.parseDouble(collectInput("Enter amount: "));
        unionBank.deposit(accountNumber,amount);
        goToMainMenu();
    }
    private static void withdraw() {
        String accountNumber = collectInput("Enter account Number: ");
        double amount = Double.parseDouble(collectInput("Enter amount: "));
        String pin = collectInput("Enter pin: ");
        unionBank.withdraw(accountNumber,amount,pin);
        goToMainMenu();
    }
    private static void transfer() {
        String accountNumber = collectInput("Enter account Number: ");
        double amount = Double.parseDouble(collectInput("Enter amount: "));
        String receiverAcountNumber = collectInput("Enter receiver account Number: ");
        String pin = collectInput("Enter pin: ");
        unionBank.transfer(accountNumber,receiverAcountNumber,amount,pin);
        goToMainMenu();
    }
    private static void checkBalance() {
        String accountNumber = collectInput("Enter account Number: ");
        String pin = collectInput("Enter pin: ");
        display(String.valueOf(unionBank.checkBalance(accountNumber,pin)));
    }
    private static String collectInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    private static void display(String prompt) {
        System.out.println(prompt);
    }
}
