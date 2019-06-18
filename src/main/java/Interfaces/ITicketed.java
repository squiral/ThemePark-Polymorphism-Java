package Interfaces;

import Visitor.Visitor;

public interface ITicketed {

    public double defaultPrice();

    public double defaultPrice(Visitor visitor);
}
