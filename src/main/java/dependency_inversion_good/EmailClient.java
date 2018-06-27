package src.main.java.dependency_inversion_good;

public class EmailClient implements Notifier {
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions == "sunny");
            System.out.print("It is sunny");
    }
}
