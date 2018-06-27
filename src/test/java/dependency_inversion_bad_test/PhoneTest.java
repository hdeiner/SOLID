package src.test.java.dependency_inversion_bad_test;
import src.main.java.dependency_inversion_bad.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneTest {
    @Test
    public void testGeneratesAlertString() {
        Phone phone = new Phone();
        assertEquals("It is rainy", phone.generateWeatherAlert("rainy"));
    }
}
