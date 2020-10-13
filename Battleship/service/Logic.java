package Battleship.service;

import Battleship.model.Coordinates;
import Battleship.model.Grid;
import Battleship.model.Ship;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    private int index = 0;

    private final Ship[] ships = new Ship[20];

    public void addShip(Grid grid) {
        addToArray(grid);
        List<Coordinates> positions = grid.positions();
    }

    private void addToArray(Ship ship) {

        this.ships[this.index++] = ship;
    }

    public int findBy(Coordinates coordinates) {
        for (int index = 0; index < ships.length; index++) {
            Ship ship = ships[index];
            if (ship != null && ship.positions().equals(coordinates)) {
                return index;
            }
        }
        System.out.println("Ship doesn't exist.");
        return -1;
    }
}
