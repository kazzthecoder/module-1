package com.techelevator;

public class SquareWall extends RectangleWall{



    public SquareWall(String name, String color, int sideLength) {
        super(name, color, sideLength, sideLength);
    }

    @Override
    public String toString() {
        int sideLength = getLength();
        String name = this.getName();
        String wallShape = "square";
        return name + " (" + sideLength +"x"+sideLength + ") " + wallShape;
    }
}
