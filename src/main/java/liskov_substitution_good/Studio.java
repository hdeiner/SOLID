package src.main.java.liskov_substitution_good;

public class Studio {
    public int squareFootage;
    public int numberOfRooms;

    public Studio() {
        this.numberOfRooms = 0;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}
