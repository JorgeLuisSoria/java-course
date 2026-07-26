//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000);
        vehicle.setYear(2010);
        System.out.println(vehicle.toString());*/

        Vehicle myCar = new Car("Toyota", "Yaris", 2018, 4);
        Vehicle moto = new Motorcycle("Honda", "CBR", 2022, false);
        ((Car)myCar).start();
        ((Motorcycle)moto).start();
        // printVehicle(myCar);
        // printVehicle(moto);

        // Casteando
        ((Car) myCar).setDoors(6);
        printVehicle(myCar);
    }

    public static void printVehicle(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }

}