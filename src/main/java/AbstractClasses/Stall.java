package AbstractClasses;

import Interfaces.IReviewed;

public abstract class Stall implements IReviewed {

    private String name;
    private int rating;
    private String ownerName;
    private int parkingLot;

    public Stall(String name, int rating, String ownerName, int parkingLot){
        this.name = name;
        this.rating = rating;
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

    public int getRating() {
        return rating;
    }
}
