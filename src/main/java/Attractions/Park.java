package Attractions;

import AbstractClasses.Attraction;
import Visitor.Visitor;

public class Park extends Attraction {

    public Park(String name){
        super(name);
    }


    public double defaultPrice() {
        return getDefaultPrice();
    }

    public double defaultPrice(Visitor visitor) {
        return 0;
    }
}
