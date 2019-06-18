package Attractions;

import AbstractClasses.Attraction;
import Interfaces.ISecurity;
import Visitor.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name){
        super(name);
    }

    public double defaultPrice() {
        return getDefaultPrice();
    }

    public double defaultPrice(Visitor visitor) {
        return getDefaultPrice();
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() < 145){
            return false;
        }

        return true;
    }
}
