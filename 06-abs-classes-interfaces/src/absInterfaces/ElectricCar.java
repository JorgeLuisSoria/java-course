package absInterfaces;

public class ElectricCar extends Vehicle implements Electric, SelfDriving{

    private int batteryCapacity;

    public ElectricCar(String brand, String model, int year, Color color, VehicleStatus vehicleStatus, int batteryCapacity) {
        super(brand, model, year, color, vehicleStatus);
        this.batteryCapacity = batteryCapacity;
    }

    public ElectricCar(String brand, String model, int year, int batteryCapacity) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void drive() {
        System.out.println("ElectricCar drive");
    }

    @Override
    public void chargeBattery() {
        batteryCapacity = MAX_BATTERY_CAPACITY;
        System.out.println("ElectricCar chargeBattery at 100%");
    }

    @Override
    public void activateAutopilot() {
        System.out.println("ElectricCar activateAutopilot");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                '}' + super.toString();
    }
}
