package src.test.java.liskov_substitution_good_test;
import src.main.java.liskov_substitution_good.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PenthouseSuiteTest {
    @Test
    public void testInitializedWithFourBedrooms() {
        PenthouseSuite penthouse = new PenthouseSuite();
        assertEquals(4, penthouse.numberOfBedrooms);
    }

    @Test
    public void testSetsSquareFootage() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1600);

        assertEquals(1600, penthouse.squareFootage);
    }
}
