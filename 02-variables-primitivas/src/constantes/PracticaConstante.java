package constantes;

public class PracticaConstante {
    public static void main(String[] args) {
        /*int workDays = 10;
        System.out.println("x = " + workDays);
        workDays = 20;
        System.out.println("x = " + workDays);
        workDays = 30;
        System.out.println("x = " + workDays);

        final double ANNUAL_INTEREST_RATE = 0.05;
        System.out.println("Annual Interest Rate: " + ANNUAL_INTEREST_RATE);*/
        final double TAX_RATE = 0.10;
        int grossSalary = 3000;
        double netSalary = grossSalary * (1 - TAX_RATE);
        System.out.println("netsalary: " + netSalary);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Estoy en la iteración: " + i);
        }
    }
}
