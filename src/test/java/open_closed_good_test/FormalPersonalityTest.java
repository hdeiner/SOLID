package src.test.java.open_closed_good_test;
import src.main.java.open_closed_good.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormalPersonalityTest {
    @Test
    public void testGreetsSomeoneFormally() {
        FormalPersonality fp = new FormalPersonality();
        assertEquals("Good evening, sir.", fp.greet());
    }
}
