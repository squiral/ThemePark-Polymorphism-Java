import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Dodgems");
    }

    @Test
    public void getName(){
        assertEquals("Dodgems", dodgems.getName());
    }
}
