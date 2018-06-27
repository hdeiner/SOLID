package src.main.java.liskov_substitution_bad;

public class Studio extends Apartment {
    public Studio() {
        this.numberOfBedrooms = 0;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}
