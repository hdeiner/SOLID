package src.test.java.open_closed_bad_test;
import src.main.java.open_closed_bad.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {
    @Test
    public void testSaysHello() {
        Greeter greeter = new Greeter();
        assertEquals("Hello.", greeter.greet());
    }

    @Test
    public void testSaysHelloFormally() {
        Greeter greeter = new Greeter();
        greeter.setFormality("formal");
        assertEquals("Good evening, sir.", greeter.greet());
    }

    @Test
    public void testSaysHelloCasually() {
        Greeter greeter = new Greeter();
        greeter.setFormality("casual");
        assertEquals("Sup bro?", greeter.greet());
    }

    @Test
    public void testSaysHelloIntimately() {
        Greeter greeter = new Greeter();
        greeter.setFormality("intimate");
        assertEquals("Hello Darling!", greeter.greet());
    }
}
