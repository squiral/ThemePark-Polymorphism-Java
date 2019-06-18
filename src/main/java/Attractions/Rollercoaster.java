package Attractions;

public class Rollercoaster extends Attraction {

    public Rollercoaster(String name){
        super(name);
    }

    public double defaultPrice() {
        return 0;
    }

    public double defaultPrice(Visitor visitor) {
        return 0;
    }
}
