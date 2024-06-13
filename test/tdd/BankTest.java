package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTest {
    Bank bank;
    @BeforeEach void setUp() {
        bank = new Bank();

    }

    @Test
    public void addCustomer() {
        bank.addCustomer("oluwafemi","janet","0814699780","1111");
        Assertions.assertEquals(1,bank.checkNooFCustomers());
    }
    @Test
    public void testICanDeposit(){
        bank.addCustomer("oluwafemi","janet","0814699780","1111");
        Assertions.assertEquals(1,bank.checkNooFCustomers());
        bank.deposit("814699780",1100);
        Assertions.assertEquals(1100,bank.checkBalance("1111","814699780"));
    }
    @Test
    public void testICanWithdraw(){
        bank.addCustomer("oluwafemi","janet","0814699780","1111");
        Assertions.assertEquals(1,bank.checkNooFCustomers());
        bank.deposit("814699780",1100);
        Assertions.assertEquals(1100,bank.checkBalance("1111","814699780"));
        bank.withdraw("814699780",500,"1111");
        Assertions.assertEquals(600,bank.checkBalance("1111","814699780"));
    }

    @Test
    public void testICanTransfer(){
        bank.addCustomer("oluwafemi","janet","0814699780","1111");
        Assertions.assertEquals(1,bank.checkNooFCustomers());
        bank.addCustomer("Eniola","Olakunle","0123456789","2222");
        Assertions.assertEquals(2,bank.checkNooFCustomers());
        bank.deposit("814699780",1000);
        Assertions.assertEquals(1000,bank.checkBalance("1111","814699780"));
        bank.transfer("814699780","123456789",500,"1111");
        Assertions.assertEquals(500,bank.checkBalance("1111","814699780"));
    }
}