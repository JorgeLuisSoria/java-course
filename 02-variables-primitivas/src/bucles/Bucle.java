package bucles;

public class Bucle {
    public static void main(String[] args) {

        final int MAX_COUNT = 5;

        for (int currentNumber = 1; currentNumber <= MAX_COUNT; currentNumber++) {
            System.out.println("Valor: " + currentNumber);
        }
        System.out.println("Salir");

        /*int counter = 0;
        while (counter <= 5) {
            System.out.println("Counter: " + counter);
            counter++;
        }*/

        int counter = 0;
        int acumulador = 0;
        while (counter < 5) {
            System.out.println("Counter :  " + counter);
            acumulador = acumulador + counter;
            counter++;
        }
        System.out.println("Acumulador : " + acumulador);


        int counter2 = 0;
        int acumulador2 = 0;
        do {
            System.out.println("Counter2:  " + counter2);
            acumulador2 = acumulador2 + counter2;
            counter2++;
        } while (counter2 < 5);
        System.out.println("Acumulador2 : " + acumulador2);
    }
}
