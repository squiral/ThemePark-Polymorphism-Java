package AbstractClasses;

import Interfaces.IReviewed;
import Interfaces.ITicketed;

public abstract class Attraction implements ITicketed, IReviewed {

    private String name;
    private int rating;
    private double defaultPrice;

    public Attraction(String name, int rating){
        this.name = name;
        this.rating = rating;
        this.defaultPrice = 5.00;
    }

    public String getName(){
        return this.name;
    }

    public double getDefaultPrice(){
        return this.defaultPrice;
    }

    public int getRating() {
        return rating;
    }
}
