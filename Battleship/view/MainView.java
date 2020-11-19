package Battleship.view;

import Battleship.model.Coordinates;
import Battleship.model.Turn;
import Battleship.service.GridService;
import Battleship.service.exceptions.MissException;

import java.util.Scanner;

public class MainView {

    public void start() {
        GridService blueGrid = new GridService();
        GridService redGrid = new GridService();
        Scanner scanner = new Scanner(System.in);
        blueGrid.createShip(Coordinates.A1, Coordinates.A2, Coordinates.A3, null, Turn.BLUE);
        System.out.println("Синий корабль с координатами A1, A2, A3 построен");
        redGrid.createShip(Coordinates.B1, Coordinates.C1, Coordinates.D1, null, Turn.RED);
        System.out.println("Красный корабль с координатами B1, C1, D1 построен");
        Turn turn = Turn.BLUE;
        do {
            System.out.println(turn + " TURN");
            System.out.println("Введите координаты выстрела: ");
            Coordinates blueShot = Coordinates.valueOf(scanner.nextLine());

            do {
                if (redGrid.isEmpty(blueShot)) {

                    System.out.println("MISS");
                    if (turn == Turn.BLUE) {
                        turn = Turn.RED;
                    } else {
                        turn = Turn.BLUE;
                    }


                } else {
                    redGrid.hit(blueShot);
                    System.out.println("HIT");
                    break;
                }
            } while (!redGrid.isEmpty(blueShot));

            System.out.println("RED TURN");
            System.out.println("Введите координаты выстрела: ");
            Coordinates redShot = Coordinates.valueOf(scanner.nextLine());

            do {
                if (blueGrid.isEmpty(redShot)) {
                    try {
                        throw new MissException();
                    } catch (MissException e) {
                        System.out.println("MISS");
                        if (turn == Turn.BLUE) {
                            turn = Turn.RED;
                        } else {
                            turn = Turn.BLUE;
                        }

                    }
                } else {
                    blueGrid.hit(redShot);
                    System.out.println("HIT");
                    break;
                }
            } while (!blueGrid.isEmpty(redShot));
        } while (!end());
    }

    public static boolean end() {
        return false;
    }
}
