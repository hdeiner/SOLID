package src.main.java.open_closed_good;

public class Greeter {
    private Personality personality;

    public Greeter(Personality personality) {
        this.personality = personality;
        }

    public String greet() {
        return this.personality.greet();
    }
}
