package Stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Mary's Milk Bar", 4, "Mary", 12);
    }

    @Test
    public void canGetName(){
        assertEquals("Mary's Milk Bar", iceCreamStall.getName());
    }

    @Test
    public void canGetParkingLot() {
        assertEquals(12, iceCreamStall.getParkingLot());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Mary", iceCreamStall.getOwnerName());
    }
}