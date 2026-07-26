package ScannerExample;

import java.util.Scanner;

public class NumberCompare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt for inputs
        System.out.println("Write the first number");
        int a = sc.nextInt();
        System.out.println("Write the second number");
        int b = sc.nextInt();

        // Operaciones
        int additionResult = a + b;
        System.out.println("The addition of both numbers is: " + additionResult);
        int subtractionResult = a - b;
        System.out.println("Substraction of both of them is: " + subtractionResult);
        int multiplicationResult = a * b;
        System.out.println("The first number multiplied by the second one is: " + multiplicationResult);
        int divisionResult = a / b;
        System.out.println("The division between them is: " + divisionResult);

        // Comparisons
        if (a >= b) {
            System.out.println("The first number is greateror equal to the second number");
        } else {
            System.out.println("The first number is lesser equal to the second number");
        }


    }

}
