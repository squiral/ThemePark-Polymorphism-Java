package Attractions;

public class Dodgems extends Attraction {

    public Dodgems(String name){
        super(name);
    }

    public double defaultPrice() {
        return 0;
    }

    public double defaultPrice(Visitor visitor) {
        return 0;
    }
}
