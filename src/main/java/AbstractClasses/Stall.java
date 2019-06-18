package AbstractClasses;

public abstract class Stall {

    private String name;
    private String ownerName;
    private int parkingLot;

    public Stall(String name, String ownerName, int parkingLot){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingLot = parkingLot;
    }

    public String getName(){
        return this.name;
    }

    public int getParkingLot() {
        return parkingLot;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
