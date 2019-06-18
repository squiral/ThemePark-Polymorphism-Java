package Attractions;

import Attractions.Visitor;

public interface ITicketed {

    public double defaultPrice();

    public double defaultPrice(Visitor visitor);
}
