package Visitor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(18, 170, 50.00);
    }

    @Test
    public void canGetHeight(){
        assertEquals(170, visitor.getHeight());
    }

    @Test
    public void canGetAge() {
        assertEquals(18, visitor.getAge());
    }

    @Test
    public void canGetMoney() {
        assertEquals(50.00, visitor.getMoney(), 0.01);
    }
}