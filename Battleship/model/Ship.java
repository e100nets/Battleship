package Battleship.model;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    Turn turn;
    List<Coordinates> points = new ArrayList<>();

    public Ship(Coordinates firstCoordinate, Turn turn) {
        points.add(firstCoordinate);
        this.turn = turn;
    }

    public Ship(Coordinates firstCoordinate, Coordinates secondCoordinate, Turn turn) {
        points.add(firstCoordinate);
        points.add(secondCoordinate);
        this.turn = turn;
    }

    public Ship(Coordinates firstCoordinate, Coordinates secondCoordinate, Coordinates thirdCoordinate, Turn turn) {
        points.add(firstCoordinate);
        points.add(secondCoordinate);
        points.add(thirdCoordinate);
        this.turn = turn;
    }

    public Ship(Coordinates firstCoordinate, Coordinates secondCoordinate,
                Coordinates thirdCoordinate, Coordinates fourthCoordinate, Turn turn) {
        points.add(firstCoordinate);
        points.add(secondCoordinate);
        points.add(thirdCoordinate);
        points.add(fourthCoordinate);
        this.turn = turn;
    }
}
