package Attractions;

public abstract class Attraction implements ITicketed {

    private String name;

    public Attraction(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
