package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTypeTest {


    @Test
    public void deposit(){
       AccountType sunday = new AccountType();

       sunday.deposit(3000);
       assertEquals(3000 , sunday.getBalance(3000));
    }
}
