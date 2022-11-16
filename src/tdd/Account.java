package tdd;

public class Account {

    private  String setPin = "1234";

    private int balance;

    public void deposit(int amount) {
        if(amount>0) {
            balance = balance + amount;
        }
    }
    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount, String setpin) {
        balance = balance - amount;
    }

    }

