package HouseExample;

public class HouseMain {
    public static void main(String[] args) {
        House firstHouse = new House();
        firstHouse.setDoors(2);
        firstHouse.setWindows(4);
        firstHouse.setSize(23);


        House secondHouse = new House();
        secondHouse.setDoors(4);
        secondHouse.setWindows(6);
        secondHouse.setSize(22);

        House thirdHouse = new House(4, 6, 20);

        System.out.println("The first House has " + firstHouse.getDoors() + " doors.");
        System.out.println("The first House has " + firstHouse.getWindows() + " windows.");
        firstHouse.openDoor();
        firstHouse.closeDoor();
        double area = firstHouse.calculateArea();
        System.out.println("The first house has an area of " + area);

    }
}
