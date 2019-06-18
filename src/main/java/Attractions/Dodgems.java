package Attractions;

import AbstractClasses.Attraction;
import Visitor.Visitor;

public class Dodgems extends Attraction {

    public Dodgems(String name, int rating){
        super(name, rating);
    }

    public double defaultPrice() {
        return getDefaultPrice();
    }

    public double defaultPrice(Visitor visitor) {
        return 0;
    }

}
