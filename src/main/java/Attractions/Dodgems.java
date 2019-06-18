package Attractions;

import AbstractClasses.Attraction;
import Visitor.Visitor;

public class Dodgems extends Attraction {

    public Dodgems(String name){
        super(name);
    }

    public double defaultPrice() {
        return getDefaultPrice();
    }

    public double defaultPrice(Visitor visitor) {
        return 0;
    }
}
