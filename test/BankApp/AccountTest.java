package BankApp;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account account;

    @Test
    void DepositWorkTest(){
        Account sundayAccount = new Account("1234");
        sundayAccount.deposit(BigDecimal.valueOf(2_000));
        assertEquals(BigDecimal.valueOf(2_000), sundayAccount.getBalance("1234"));
    }


    @Test
    void GetBalanceWithCollectPinTest(){
        Account sundayAccount = new Account("1234");
        sundayAccount.deposit(BigDecimal.valueOf(2_000));
        assertEquals(BigDecimal.valueOf(2_000), sundayAccount.getBalance("1234"));
    }

    @Test
    void WithdrawWorkTest(){
        Account sundayAccount = new Account("1234");
        sundayAccount.deposit(BigDecimal.valueOf(5_000));
        sundayAccount.withdraw(BigDecimal.valueOf(4_000));
        assertEquals(BigDecimal.valueOf(1_000), sundayAccount.getBalance("1234"));
    }

}