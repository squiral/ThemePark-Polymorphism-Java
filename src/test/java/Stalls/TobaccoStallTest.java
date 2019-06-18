package Stalls;

import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor babyVisitor;
    Visitor oldVisitor;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Smokey's", "Mr Smokey", 36);
        babyVisitor = new Visitor(6, 45, 200.00);
        oldVisitor = new Visitor(66, 160, 150.00);
    }

    @Test
    public void babyIsNotAllowedTo() {
        assertEquals(false, tobaccoStall.isAllowedTo(babyVisitor));
    }

    @Test
    public void OldManIsAllowedTo() {
        assertEquals(true, tobaccoStall.isAllowedTo(oldVisitor));
    }
}