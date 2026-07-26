package finalProject;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat;

        do {
            // System.out.println("Ingrese la edad");
            // int age = input.nextInt();
            System.out.println("Ingrese tres calificaciones");
            int grade1 = input.nextInt();
            int grade2 = input.nextInt();
            int grade3 = input.nextInt();

            int sum = grade1 + grade2 + grade3;
            double avg = sum / 3.0;

            if (avg >= 6) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }

            System.out.println("¿Desea continuar? (1/0)");
            int option = input.nextInt();
            repeat = option == 1;

        } while (repeat);


        System.out.println("Programa finalizado");
        input.close();
    }
}
