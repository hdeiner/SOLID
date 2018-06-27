package src.main.java.liskov_substitution_good;

public class BedroomAdder {
    public void addBedroom(PenthouseSuite penthouse) {
        penthouse.numberOfBedrooms += 1;
    }
}
