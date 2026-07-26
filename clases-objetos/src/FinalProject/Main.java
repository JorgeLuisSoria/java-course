package FinalProject;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Jorge Soria", 12000.00);
        BankApp bankApp = new BankApp(bankAccount);
        bankApp.start();
    }
}
