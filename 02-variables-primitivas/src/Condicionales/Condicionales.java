package Condicionales;

public class Condicionales {
    public static void main(String[] args) {
        /*int age = 17;
        if (age > 18) {
            System.out.println("Es mayor");
        } else {
            System.out.println("Es menor");
        }*/
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("El dato ingresado no es válido");
        }
    }
}
