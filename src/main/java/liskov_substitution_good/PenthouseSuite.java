package src.main.java.liskov_substitution_good;

public class PenthouseSuite {
    public int squareFootage;
    public int numberOfBedrooms;

    public PenthouseSuite() {
        this.numberOfBedrooms = 4;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}
