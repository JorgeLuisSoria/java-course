package ScannerExample;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = getNumber(sc, "Enter first number");
        int num2 = getNumber(sc, "Enter second number");

        // Sum and substraction
        int addition = num1 + num2;
        printAritmethicalResult(addition, "addition");
        int subtraction = num1 - num2;
        printAritmethicalResult(subtraction, "subtraction");

        // Comparison
        compareNumber(num1, num2);

    }

    public static int getNumber(Scanner scanner, String message) {
        System.out.println(message);
        int num = scanner.nextInt();
        return num;
    }

    public static void printAritmethicalResult(int result, String typeOp) {
        if (typeOp.equals("addition")) {
            System.out.println("Addition result: " + result);
        } else if (typeOp.equals("subtraction")) {
            System.out.println("Subtraction result: " + result);
        }
    }

    public static void compareNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than the second number");
        }  else if (firstNumber < secondNumber) {
            System.out.println("The first number is less than the second number");
        }
    }

}
