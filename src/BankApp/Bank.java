package BankApp;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();
    public void CreateAccountFor(String FirstName, String LastName, String Pin) {
        int accountNumber = accounts.size()+1;
        Object accountName = new Object();
        Account newAccount = new Account(accountNumber , accountName,  FirstName+ " " +LastName, Pin);
        accounts.add(newAccount);
    }

    public int getNumberOfCustomer() {
        return 0;
    }

    public void createAccountFor(String firstName, String lastName, String pin) {

    }

    public void depositInto(int accountNumber, BigDecimal amount) {

    }

    public void withdrawFrom(int accountNumber, BigDecimal amount, String pin) {

    }

    public void transfer(BigDecimal amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {

    }

    public BigDecimal checkBalanceFor(int accountNumber, String pin) {
        return null;
    }
}
