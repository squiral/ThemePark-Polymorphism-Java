package Interfaces;

import Visitor.Visitor;

public interface ISecurity {

    public boolean isAllowedTo(Visitor visitor);
}
