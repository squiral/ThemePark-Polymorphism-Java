package Attractions;

import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaygroundTest {

    Playground playground;
    Visitor olderVisitor;
    Visitor youngerVisitor;

    @Before
    public void before(){
        playground = new Playground("Bingal's");
        olderVisitor = new Visitor(17, 140, 20.00);
        youngerVisitor = new Visitor(12, 110, 10.00);
    }


    @Test
    public void defaultPrice() {
        assertEquals(5.00, playground.defaultPrice(), 0.01);
    }

    @Test
    public void olderBoyisNotAllowedTo() {
        assertEquals(false, playground.isAllowedTo(olderVisitor));
    }

    @Test
    public void youngerBoyIsAllowedTo() {
        assertEquals(true, playground.isAllowedTo(youngerVisitor));
    }
}