package src.test.java.liskov_substitution_good_test;
import src.main.java.liskov_substitution_good.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudioTest {
    @Test
    public void testInitializedWithZeroBedrooms() {
        Studio studio = new Studio();
        assertEquals(0, studio.numberOfRooms);
    }

    @Test
    public void testSetsSquareFootage() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);

        assertEquals(550, studio.squareFootage);
    }
}
