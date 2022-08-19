package com.techelevator;

public class TriangleWall extends Wall {
    private int base;
    private int height;

    public TriangleWall(String name, String color, int base, int height) {
        super(name,color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        int area = (this.base*this.height)/2;
        return area;
    }
    @Override
    public String toString() {
        int base = getBase();
        int height = getHeight();
        String name = this.getName();
        String wallShape = "triangle";
        return name + " (" + base +"x"+height + ") " + wallShape;
    }
}
