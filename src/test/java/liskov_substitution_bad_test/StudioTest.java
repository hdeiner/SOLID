package src.test.java.liskov_substitution_bad_test;
import src.main.java.liskov_substitution_bad.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudioTest {
    @Test
    public void testInitializedWithZeroBedrooms() {
        Studio studio = new Studio();
        assertEquals(0, studio.numberOfBedrooms);
    }

    @Test
    public void testSetSquareFootage() {
        Studio studio = new Studio();
        studio.setSquareFootage(600);
        assertEquals(600, studio.squareFootage);
    }
}
