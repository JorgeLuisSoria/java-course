package FinalProject;

public class BankAccount {

    private String accountHolder;
    private Double balance;

    public BankAccount(String accountHolder, Double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " from " + accountHolder);
        } else {
            System.out.println("The amount is negative");
        }
    }

    public void withdraw(Double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from " + accountHolder);
        } else {
            System.out.println("The amount is out of range");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

}
