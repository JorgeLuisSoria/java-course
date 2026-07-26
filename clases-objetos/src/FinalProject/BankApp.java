package FinalProject;

import java.util.Scanner;

public class BankApp {

    private BankAccount account;
    private Scanner scanner;

    public BankApp(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option;
        do {
            displayMenu();
            option = getUserOption();
            processOption(option);
        } while (option != 4);
    }

    public void displayMenu() {
        System.out.println("\nSelect an option:");
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. Show balance");
        System.out.println("4. Exit");
    }

    private int getUserOption() {
        return scanner.nextInt();
    }

    private void handleDeposit() {
        System.out.println("Enter amount to be deposited:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
    }

    private void handleWithdraw() {
        System.out.println("Enter amount to be withdrawn:");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }

    private void processOption(int option) {
        switch (option) {
            case 1: {
                handleDeposit();
                break;
            }
            case 2: {
                handleWithdraw();
                break;
            }
            case 3: {
                account.displayBalance();
                break;
            }
            case 4: {
                System.out.println("Thanks for using our Bank!");
                break;
            }
            default: {
                System.out.println("Invalid option!");
            }
        }
    }


}
