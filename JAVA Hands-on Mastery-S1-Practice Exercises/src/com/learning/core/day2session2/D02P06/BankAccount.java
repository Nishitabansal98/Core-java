package com.learning.core.day2session2.D02P06;
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

public class BankAccount {
    private int accountNumber;
    private String customName;
    private String accountType;
    private float balance;

    public BankAccount(int accountNumber, String customName, String accountType, float initialBalance)
            throws LowBalanceException, NegativeAmountException {
        this.accountNumber = accountNumber;
        this.customName = customName;
        this.accountType = accountType;

        if (accountType.equals("saving") && initialBalance < 1000) {
            throw new LowBalanceException("Low Balance");
        }

        if (accountType.equals("current") && initialBalance < 5000) {
            throw new LowBalanceException("Low Balance");
        }

        if (initialBalance < 0) {
            throw new NegativeAmountException("Negative Amount");
        }

        this.balance = initialBalance;
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("Negative Amount");
        }

        balance += amt;
    }

    public float getBalance() throws LowBalanceException {
        if (accountType.equals("saving") && balance < 1000) {
            throw new LowBalanceException("Low Balance");
        }

        if (accountType.equals("current") && balance < 5000) {
            throw new LowBalanceException("Low Balance");
        }

        return balance;
    }

    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount(1, "John", "saving", 900);
            account1.deposit(100);
            System.out.println("Balance after deposit: " + account1.getBalance());
        } catch (LowBalanceException | NegativeAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            BankAccount account2 = new BankAccount(2, "John", "saving", -900);
            System.out.println("Balance: " + account2.getBalance());
        } catch (LowBalanceException | NegativeAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}