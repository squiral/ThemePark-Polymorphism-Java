package Attractions;

import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor shortVisitor;
    Visitor tallVisitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Space Mountain");
        shortVisitor = new Visitor(25, 120, 30.00);
        tallVisitor = new Visitor(14, 180, 20.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Space Mountain", rollercoaster.getName());
    }

    @Test
    public void getDefaultPrice() {
        assertEquals(5.00, rollercoaster.defaultPrice(), 0.01);
    }

    @Test
    public void shortyNotAllowed() {
        assertEquals(false, rollercoaster.isAllowedTo(shortVisitor));
    }

    @Test
    public void tallBoyAllowed() {
        assertEquals(true, rollercoaster.isAllowedTo(tallVisitor));
    }
}
