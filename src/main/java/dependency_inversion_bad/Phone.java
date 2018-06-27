package src.main.java.dependency_inversion_bad;

public class Phone {
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
