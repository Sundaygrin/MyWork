package BankApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    public void createABankAccount(){
        Bank gtbank = new Bank();
        gtbank.CreateAccountFor("Sunday", "Grin" , "1234");
        assertEquals(1,gtbank.getNumberOfCustomer());

    }

}