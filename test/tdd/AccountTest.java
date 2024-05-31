package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void testCheckingAccountBalanceIs0() {
        Account ifeoluwa = new Account();
        double balance = 0.0;
        balance = ifeoluwa.checkingBalance("pin");
        assertEquals(0, balance);
    }
    @Test
    public void testIDeposit1kAndCheckingAccountBalanceIs1k() {
        Account janet = new Account();
        assertEquals(0,janet.checkingBalance("pin"));
        janet.deposit("pin", 1000);
        int  balance = janet.checkingBalance("pin");
        assertEquals(1000,balance);
    }
    @Test
    public void testIWithdraw2kAndCheckingAccountBalanceIs3k() {
        Account janet = new Account();
        assertEquals(0,janet.checkingBalance("pin"));
        janet.deposit("pin",5000);
        int balance = janet.checkingBalance("pin");
        assertEquals(5000,balance);
        janet.withdraw("pin", 2000);
        balance = janet.checkingBalance("pin");
        assertEquals(3000,balance);
    }
    @Test
    public void testIWithdraw5kAndCheckingAccountBalanceIs2k() {
        Account janet = new Account();
        assertEquals(0,janet.checkingBalance("pin"));
        janet.deposit("pin",2000);
        assertEquals(2000,janet.checkingBalance("pin"));
        janet.withdraw("pin", 5000);
        int balance = janet.checkingBalance("pin");
        assertEquals(2000,balance);
    }
    
}