package src.test.java.dependency_inversion_good_test;
import src.main.java.dependency_inversion_good.*;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MobileDeviceTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testAlertsWhenRainy() {
        MobileDevice iPhone = new MobileDevice();
        System.setOut(new PrintStream(outContent));
        iPhone.alertWeatherConditions("rainy");

        assertEquals("It is rainy", outContent.toString());
    }
}
