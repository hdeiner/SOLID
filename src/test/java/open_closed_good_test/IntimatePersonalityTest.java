package src.test.java.open_closed_good_test;
import src.main.java.open_closed_good.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntimatePersonalityTest {
    @Test
    public void testGreetsSomeoneIntimately() {
        IntimatePersonality ip = new IntimatePersonality();
        assertEquals("Hello Darling!", ip.greet());
    }
}
