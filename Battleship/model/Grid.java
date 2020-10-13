package Battleship.model;

import java.util.ArrayList;
import java.util.List;

public class Grid implements Ship {

    private final ArrayList<Coordinates> positions;


    public Grid(final ArrayList<Coordinates> positions) {
        this.positions = positions;
    }



    @Override
    public List<Coordinates> positions() {
        return positions;
    }
}
