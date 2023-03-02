package BankApp;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private BigDecimal balance = BigDecimal.ZERO;
    private String pin = "1234";

    Account(String accountPin){
        this.pin = accountPin;
    }

    public Account(int accountNumber, Object accountName, String s, String pin) {

    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        validate(pin);
    }
    public BigDecimal getBalance(String pin) {
        validate(pin);
        return balance;
    }


    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);


    }

    private void validate(String pin) {
        if (!Objects.equals(this.pin,pin)) throw new IllegalArgumentException("invalid pin");
    }

    @Override
    public String toString(){
        return String.format("""
                ==================================
                Account Name: %s
                Account Number: %s
                Account Balance: %s
                ==================================
                """ );
    }
}
