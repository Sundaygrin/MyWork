package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FidelityAccountTest {
    private int assertTrue(int amount, int balance) {
        return amount;
    }


    @Test
    public void deposit(){

        FidelityAccount sundayBankAccount = new FidelityAccount();
        sundayBankAccount.deposit(50000);
        assertEquals(50000, sundayBankAccount.getBalance (50000));
    }

    @Test
    public  void  withdrawal(){

        FidelityAccount sundayBankAccount = new FidelityAccount();
        sundayBankAccount.deposit(50000);
        sundayBankAccount.withdrawal(20000);
        assertTrue(30000, sundayBankAccount.getBalance (30000));
    }



    @Test
    public void transferToAnotherBank(){

        FidelityAccount sundayBankAccount = new FidelityAccount();
        sundayBankAccount.deposit(100000);
        sundayBankAccount.transfer(70000);
        assertTrue(30000, sundayBankAccount.getBalance (30000));

    }


}