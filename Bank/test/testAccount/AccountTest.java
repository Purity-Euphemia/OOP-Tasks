package testAccount;

import BankApp.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account purityAccount;

    @BeforeEach
    public void setUp() {
        purityAccount = new Account("purity", "1111", 0, "1234567890");
    }

    @Test
    public void getBalanceTest() {
        int balance = purityAccount.getBalance();
        assertEquals(0, balance);

        int balance2 = purityAccount.deposit(2000);
        assertEquals(2000, balance2);
    }

    @Test
    public void deposit2kTwice_balanceIs4kTest() {
        int balance = purityAccount.deposit(2000);
        assertEquals(2000, balance);

        int balance2 = purityAccount.deposit(2000);
        assertEquals(4000, balance2);

    }

    @Test
    public void depositNegativeAmount_balanceIsUnchangeTest() {
        int depositAmount = purityAccount.deposit(-2000);
        assertEquals(0, depositAmount);

    }

    @Test
    public void withdrawTest() {
        int depositAmount = purityAccount.deposit(3000);
        int withdrawAmount = purityAccount.withdraw(2000);
        assertEquals(1000, withdrawAmount);

        int balance = purityAccount.getBalance();
        assertEquals(1000, balance);

    }

    @Test
    public void withdrawNegativeAmount_balanceIsUnchangeTest() {
        int depositAmount = purityAccount.deposit(3000);
        assertEquals(3000, depositAmount);

        int withdrawAmount = purityAccount.withdraw(-2000);
        assertEquals(3000, withdrawAmount);
    }

    @Test
    public void withdrawMoneyThatNotGreaterThanAmount_balanceIsUnchangeTest() {
        int depositAmount = purityAccount.deposit(3000);
        assertEquals(3000, depositAmount);

        int withdrawAmount = purityAccount.withdraw(5000);
        assertEquals(3000, withdrawAmount);
    }

    @Test
    public void transferTest() {
        int depositAmount = purityAccount.deposit(7000);
        assertEquals(7000, depositAmount);

        int transferAmount = purityAccount.transfer(3000);
        assertEquals(4000, transferAmount);
    }

    @Test
    public void transferNegativeAmount_balanceIsUnchangeTest() {
        int depositAmount = purityAccount.deposit(7000);
        assertEquals(purityAccount.getBalance(), depositAmount);

        int transferAmount = purityAccount.transfer(-3000);
        assertEquals(7000, transferAmount);
    }

    @Test
    public void transferHigherAmountThanOriginalBalance_balanceIsChangeTest() {
        int depositAmount = purityAccount.deposit(7000);
        assertEquals(purityAccount.getBalance(), depositAmount);

        int transferAmount = purityAccount.transfer(10000);
        assertEquals(7000, transferAmount);
    }

    @Test
    public void createAccountTest() {
        Account newAccount = new Account( "Purity", "1111", 0, "1234567890");
        assertEquals("Purity", newAccount.getName());
        assertEquals("1111", newAccount.getPin());
        assertEquals("1234567890",newAccount.getAccountNumber());
        assertEquals(0,newAccount.getBalance());
    }


}
