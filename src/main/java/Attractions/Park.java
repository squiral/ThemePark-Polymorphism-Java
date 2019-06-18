package Attractions;

public class Park extends Attraction {

    public Park(String name){
        super(name);
    }


    public double defaultPrice() {
        return 0;
    }

    public double defaultPrice(Visitor visitor) {
        return 0;
    }
}
