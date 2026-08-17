package com.devtalles.exception.customized.unchecked;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            throw  new NegativeBalanceException("Negative balance");
        }

        balance -= amount;
        System.out.println("Withdraw Successful");
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = null;
        try {
            bankAccount = new BankAccount(1000);
            bankAccount.withdraw(1500);
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Current balance: " + bankAccount.getBalance());

    }
}
