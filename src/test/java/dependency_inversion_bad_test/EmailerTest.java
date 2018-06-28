package src.test.java.dependency_inversion_bad_test;

import org.junit.Test;
import src.main.java.dependency_inversion_bad.Emailer;

import static org.junit.Assert.assertEquals;


public class EmailerTest {
    @Test
    public void testGeneratesAlertString() {
        Emailer emailer = new Emailer();
        assertEquals("It is sunny", emailer.generateWeatherAlert("sunny"));
    }
}
