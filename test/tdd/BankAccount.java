package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccount {

    @Test
    public void deposit(){
        MyAccountBankAccount sunday = new MyAccountBankAccount();
        sunday.deposit(30000);
        assertEquals(30000, sunday.getBalance (30000));
    }

    @Test
    public void withDraw(){
        MyAccountBankAccount sunday = new MyAccountBankAccount();
        sunday.deposit(15000);
        sunday.withDraw(7000);
        assertEquals(8000, sunday.getBalance(8000));
    }

    @Test
    public void withDrawMoreThanBalance(){
        MyAccountBankAccount sunday = new MyAccountBankAccount();
        sunday.deposit(2000);
        sunday.withDrawNgetive(4000);
        assertEquals(2000, sunday.getBalance(2000));
    }
}
