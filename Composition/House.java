package Composition;

public class House {
    private Room room; // Composition

    House(){
        this.room = new Room(); // room is creted with house -> if house is destroyed room is also destroyed
    }

    void openHouse(){
        System.out.println("House is opened");
        room.open();
    }
}
