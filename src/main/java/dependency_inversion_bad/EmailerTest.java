package src.main.java.dependency_inversion_bad;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EmailerTest {
    @Test
    public void testGeneratesAlertString() {
        Emailer emailer = new Emailer();
        assertEquals("It is sunny", emailer.generateWeatherAlert("sunny"));
    }
}
