package src.test.java.open_closed_good_test;
import src.main.java.open_closed_good.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class MockPersonality implements Personality {
    public String greet() {
        return "foo";
    }
}

public class GreeterTest {
    @Test
    public void testGreetsSomeone() {
        MockPersonality mockPersonality = new MockPersonality();
        Greeter greeter = new Greeter(mockPersonality);

        assertEquals("foo", greeter.greet());
    }
}
