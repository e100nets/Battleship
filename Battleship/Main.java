package Battleship;

import Battleship.model.Coordinates;
import Battleship.model.Grid;
import Battleship.service.Logic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic();
        System.out.println("ENTER COORDINATES: ");
        String string = scanner.nextLine();
        ArrayList<Coordinates> positions = new ArrayList<>();
        Coordinates coord = Coordinates.valueOf(string);
        positions.add(coord);
        logic.addShip(new Grid(positions));
        System.out.println(logic.findBy(coord));
    }
}
