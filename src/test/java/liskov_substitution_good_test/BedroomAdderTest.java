package src.test.java.liskov_substitution_good_test;
import src.main.java.liskov_substitution_good.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomAdderTest {
    @Test
    public void testAddsBedroomToPenthouse() {
        PenthouseSuite penthouse = new PenthouseSuite();
        BedroomAdder adder = new BedroomAdder();
        adder.addBedroom(penthouse);

        assertEquals(5, penthouse.numberOfBedrooms);
    }
}
