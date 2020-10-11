package Battleship.service;

import Battleship.model.Coordinates;
import Battleship.model.Grid;
import Battleship.model.Ship;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    private int index = 0;

    private final Ship[] ship = new Ship[20];

    private void addShip(Ship ship) {
        addToArray(ship);
        List<Coordinates> positions = ship.position();
    }

    private void addToArray(Ship ship) {
        this.ship[this.index++] = ship;
    }

    private void buildTeam() {
        addShip(Grid(positions.add()));

    }

}
