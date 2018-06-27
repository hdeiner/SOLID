package src.test.java.interface_segregation_good_test;
import src.main.java.interface_segregation_good.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PenguinTest {
    @Test
    public void testItCanSwim() {
        Penguin penguin = new Penguin(5);
        penguin.swim();
        assertEquals("in the water", penguin.currentLocation);
    }

    @Test
    public void testItLosesFeathersQuickly() {
        Penguin penguin = new Penguin(5);
        penguin.molt();
        assertEquals(1, penguin.numberOfFeathers);
    }
}
