package ScannerExample;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el primer número: ");
        int firstNum = scanner.nextInt();
        // System.out.println("Imprimir firstNum: " + firstNum);

        System.out.println("Digite el segundo número: ");
        int secondNum = scanner.nextInt();
        // System.out.println("Imprimir secondNum: " + secondNum);
        System.out.println("EL resultado de la suma de ambos números es: " + (firstNum + secondNum));
        System.out.println("EL resultado de la diferencia de ambos números es: " + (firstNum - secondNum));
        if (firstNum > secondNum) {
            System.out.println("El primer número es mayor firstNum el segundo");
        } else {
            System.out.println("El segundo número es mayor firstNum el primero");
        }

        System.out.println("Fin de la aplicación");
        scanner.close();
    }
}
