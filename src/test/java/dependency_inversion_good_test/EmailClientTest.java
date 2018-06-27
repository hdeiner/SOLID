package src.test.java.dependency_inversion_good_test;
import src.main.java.dependency_inversion_good.*;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class EmailClientTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testAlertsWhenSunny() {
        EmailClient gmail = new EmailClient();
        System.setOut(new PrintStream(outContent));
        gmail.alertWeatherConditions("sunny");

        assertEquals("It is sunny", outContent.toString());
    }
}
