package src.main.java.liskov_substitution_bad;

public abstract class Apartment {
    public int squareFootage;
    public int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);
}
