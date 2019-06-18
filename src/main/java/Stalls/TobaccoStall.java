package Stalls;

import AbstractClasses.Stall;
import Interfaces.ISecurity;
import Visitor.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, int rating, String ownerName, int parkingLot){
        super(name, rating, ownerName, parkingLot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 18){
            return false;
        }

        return true;
    }
}
