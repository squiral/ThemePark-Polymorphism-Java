import Attractions.*;
import Stalls.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThemeParkTest {

    ThemePark themePark;

    Dodgems dodgems;
    Park park;
    CandyFlossStall candyFlossStall;


    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Dodgems", 3);
        park = new Park("Dingle's", 4);
        candyFlossStall = new CandyFlossStall("Flossy", 5, "Mr Flossy", 45);


    }

    @Test
    public void canAddReview() {
        themePark.addReview(dodgems);
        themePark.addReview(park);
        themePark.addReview(candyFlossStall);
        assertEquals(3, themePark.getAllReviewed().size());
    }


}