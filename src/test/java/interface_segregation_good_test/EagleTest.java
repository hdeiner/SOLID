package src.test.java.interface_segregation_good_test;
import src.main.java.interface_segregation_good.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EagleTest {
    @Test
    public void testItCanFly() {
        Eagle eagle = new Eagle(5);
        eagle.fly();
        assertEquals("in the air", eagle.currentLocation);
    }

    @Test
    public void testItLosesFeathers() {
        Eagle eagle = new Eagle(5);
        eagle.molt();
        assertEquals(4, eagle.numberOfFeathers);
    }
}
