package Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Tomorrowland", 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Tomorrowland", park.getName());
    }

}