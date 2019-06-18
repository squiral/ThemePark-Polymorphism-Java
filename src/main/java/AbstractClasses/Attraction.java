package AbstractClasses;

import Interfaces.ITicketed;

public abstract class Attraction implements ITicketed {

    private String name;
    private double defaultPrice;

    public Attraction(String name){
        this.name = name;
        this.defaultPrice = 5.00;
    }

    public String getName(){
        return this.name;
    }

    public double getDefaultPrice(){
        return this.defaultPrice;
    }
}
