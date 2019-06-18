package Attractions;

import AbstractClasses.Attraction;
import Interfaces.ISecurity;
import Visitor.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating){
        super(name, rating);
    }

    public double defaultPrice() {
        return getDefaultPrice();
    }

    public double defaultPrice(Visitor visitor) {
        return getDefaultPrice();
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 15){
            return false;
        }

        return true;
    }
}
