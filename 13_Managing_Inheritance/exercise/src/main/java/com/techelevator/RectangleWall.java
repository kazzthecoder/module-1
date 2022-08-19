package com.techelevator;

public class RectangleWall extends Wall {
    private int length;
    private int height;


    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }


    @Override
    public String toString() {
        int height = getHeight();
        int length = getLength();
        String name = this.getName();
        String wallShape = "rectangle";
        return name + " (" + length +"x"+height + ") " + wallShape;
    }


    @Override
    public int getArea() {
        int area = this.height*this.length;
        return area;
    }
}
