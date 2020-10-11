package Battleship.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grid implements Ship {
    private final List<Coordinates> positions = new ArrayList<>();


    public Grid(final Coordinates coordinates) {
        positions.addAll(Collections.singletonList(coordinates));
    }

    @Override
    public List<Coordinates> position() {
        return null;
    }
}
