package Stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Flossy!", 3, "Miss Flossy", 23);
    }


    @Test
    public void getName() {
        assertEquals("Flossy!", candyFlossStall.getName());
    }

    @Test
    public void getParkingLot() {
        assertEquals(23, candyFlossStall.getParkingLot());
    }

    @Test
    public void getOwnerName() {
        assertEquals("Miss Flossy", candyFlossStall.getOwnerName());
    }
}