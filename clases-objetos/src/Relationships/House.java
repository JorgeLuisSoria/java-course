package Relationships;

public class House {

    private Room room; // Composición parecida a Master Detail
    private Door door; // Composición parecida a Master Detail
    private Owner owner; // Asociación (Como lookup en Salesforce)

    public House(Room room, Door door, Owner owner) {
        this.room = room;
        this.door = door;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "room=" + room +
                ", door=" + door +
                ", owner=" + owner +
                '}';
    }
}
