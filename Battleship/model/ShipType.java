package Battleship.model;

public enum ShipType {
    SINGLE(1), DOUBLE(2), TRIPLE(3), QUADRO(4);
    public final int size;

    ShipType(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
