package src.main.java.single_responsibility_good;

import java.util.ArrayList;

public class Board {
    public int size;
    public ArrayList<String> spots;

    public Board(int size) {
        this.size = size;
        this.spots = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            this.spots.add(String.valueOf(3*i));
            this.spots.add(String.valueOf(3*i + 1));
            this.spots.add(String.valueOf(3*i + 2));
        }
    }

    public ArrayList<String> valuesAt(ArrayList<Integer> indexes) {
        ArrayList<String> values = new ArrayList<String>();

        for (int index : indexes) {
            values.add(this.spots.get(index));
        }

        return values;
    }
}
