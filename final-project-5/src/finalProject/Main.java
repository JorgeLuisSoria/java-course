package finalProject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Fiat", "Duna", 2010, CarType.SEDAN);
        Vehicle myElectricCar = new ElectricCar("Tesla", "T5", 2022, CarType.SPORTS, 100);

        myCar.start();
        myElectricCar.start();

        ((ElectricCar)myElectricCar).chargeBattery();

        System.out.println(myElectricCar);
        System.out.println(myCar);
    }
}