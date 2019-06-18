package Attractions;



import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Dodgems", 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Dodgems", dodgems.getName());
    }
}
