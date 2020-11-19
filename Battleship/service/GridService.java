package Battleship.service;

import Battleship.model.Coordinates;
import Battleship.model.Ship;
import Battleship.model.Turn;

public class GridService {
    private Ship[][] ships = new Ship[10][10];

    public void createShip(Coordinates firstCoordinate, Coordinates secondCoordinate,
                           Coordinates thirdCoordinate, Coordinates fourthCoordinate, Turn turn) {
        if (secondCoordinate != null) {
            if (thirdCoordinate != null) {
                if (fourthCoordinate != null) {
                    Ship ship = new Ship(firstCoordinate, secondCoordinate, thirdCoordinate, fourthCoordinate, turn);
                    ships[firstCoordinate.getX()][firstCoordinate.getY()] = ship;
                    ships[secondCoordinate.getX()][secondCoordinate.getY()] = ship;
                    ships[thirdCoordinate.getX()][thirdCoordinate.getY()] = ship;
                    ships[fourthCoordinate.getX()][fourthCoordinate.getY()] = ship;
                }
                Ship ship = new Ship(firstCoordinate, secondCoordinate, turn);
                ships[firstCoordinate.getX()][firstCoordinate.getY()] = ship;
                ships[secondCoordinate.getX()][secondCoordinate.getY()] = ship;
                ships[thirdCoordinate.getX()][thirdCoordinate.getY()] = ship;
            }
            Ship ship = new Ship(firstCoordinate, turn);
            ships[firstCoordinate.getX()][firstCoordinate.getY()] = ship;
            ships[secondCoordinate.getX()][secondCoordinate.getY()] = ship;
        } else {
            Ship ship = new Ship(firstCoordinate, turn);
            ships[firstCoordinate.getX()][firstCoordinate.getY()] = ship;
        }
    }

    public boolean isEmpty(Coordinates coordinate) {
        return ships[coordinate.getX()][coordinate.getY()] == null;
    }

    public void hit(Coordinates coordinate) {
        ships[coordinate.getX()][coordinate.getY()] = null;
    }
}

