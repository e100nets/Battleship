package Battleship.model;

public class Ship {
    private int oXCoord;
    private int oYCoord;
    private int breakageRate;
    private ShipType type;

    public Ship(int oXCoord, int oYCoord, int breakageRate, ShipType type) {
        this.oXCoord = oXCoord;
        this.oYCoord = oYCoord;
        this.breakageRate = breakageRate;
        this.type = type;
    }

    public ShipType getType() {
        return type;
    }

    public int getoXCoord() {
        return oXCoord;
    }

    public int getoYCoord() {
        return oYCoord;
    }

    public int getBreakageRate() {
        return breakageRate;
    }

    public void setBreakageRate(int breakageRate) {
        this.breakageRate = breakageRate;
    }

}
